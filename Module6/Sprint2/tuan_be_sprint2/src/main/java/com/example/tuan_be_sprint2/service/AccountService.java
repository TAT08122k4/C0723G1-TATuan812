package com.example.tuan_be_sprint2.service;

import com.example.tuan_be_sprint2.config.JwtTokenUtil;
import com.example.tuan_be_sprint2.model.Account;
import com.example.tuan_be_sprint2.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.zip.DataFormatException;

@RequiredArgsConstructor
@Service
public class AccountService implements IAccountService{
    @Autowired
    private final JwtTokenUtil jwtTokenUtil;
    @Autowired
    private final AuthenticationManager authenticationManager;
    @Autowired
    private final PasswordEncoder passwordEncoder;

    @Autowired
    AccountRepository accountRepository;
    @Override
    public Account findAccountByEmail(String email) {
        return accountRepository.findAccountByEmail(email);
    }

    @Override
    public Account findAccountByPhone(String phone) {
        return accountRepository.findAccountByPhone(phone);
    }

    @Override
    public Account findAccountByAccountName(String accountName) {
        return accountRepository.findAccountByAccountName(accountName);
    }

    @Override
    public Account findAccountByPassword(String password) {
        return accountRepository.findAccountByPassword(password);
    }

    @Override
    public Account findAccountById(int id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public void register(Account account, int roleId) {
        accountRepository.register(account,roleId);

    }

    @Override
    public String login(String nameAccount, String passWord) throws Exception {
        Optional<Account>accountOptional =accountRepository.findByAccountName(nameAccount);
if (accountOptional.isEmpty()){
throw  new DataFormatException("sai tài khoản mật khẩu");
}
Account existingAccount = accountOptional.get();
if (!passwordEncoder.matches(passWord,existingAccount.getPassword())){
    throw new BadCredentialsException("sai tài khoản hoặc mật khẩu");
}
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(nameAccount,passWord,existingAccount.getAuthorities());
authenticationManager.authenticate(authenticationToken);

        return jwtTokenUtil.generateToken(accountOptional.get());
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }
}
