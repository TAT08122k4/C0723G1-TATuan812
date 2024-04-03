package com.example.tuan_be_sprint2.controller;


import com.example.tuan_be_sprint2.dto.AccountDto;
import com.example.tuan_be_sprint2.dto.ApiResponse;
import com.example.tuan_be_sprint2.model.Account;
import com.example.tuan_be_sprint2.model.Role;
import com.example.tuan_be_sprint2.service.AccountService;
import com.example.tuan_be_sprint2.service.IAccountService;
import com.example.tuan_be_sprint2.service.IRoleService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/account")
public class AccountRestController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    IAccountService accountService;
    @Autowired
    IRoleService roleService;

    @PatchMapping("/edit/{id}")
    public ResponseEntity<?> editAccount(@RequestBody @Valid AccountDto accountDto,BindingResult bindingResult , @PathVariable int id) {
        Map<String, String> listError = new HashMap<>();
        Account account3 = accountService.findAccountById(id);
        Account account = accountService.findAccountByPhone(accountDto.getPhoneNumber());
        Account account1 = accountService.findAccountByEmail(accountDto.getEmail());
        Account account4 = accountService.findAccountByAccountName(account3.getAccountName());
        if (bindingResult.hasFieldErrors()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {
            if (accountService.findAccountByEmail(accountDto.getEmail()) != null && !(account1.getEmail().equals(account3.getEmail()))) {
                listError.put("email", "Email Đã Tồn Tại");
            }
            if (accountService.findAccountByPhone(accountDto.getPhoneNumber()) != null && !(account.getPhoneNumber().equals(account3.getPhoneNumber())) ) {
                listError.put("phoneNumber", "Số Điện Thoại Đã Tồn Tại");
            }
            if (accountService.findAccountByAccountName(accountDto.getAccountName()) != null && !(account4.getAccountName().equals(account3.getAccountName()))) {
                listError.put("accountName", "Tài Khoản Đã Tồn Tại");
            }
            if (listError.size() > 0) {
                return new ResponseEntity<>(listError, HttpStatus.BAD_REQUEST);
            }
            Account account2 = new Account();
            BeanUtils.copyProperties(accountDto, account2);
            account2.setRole(account3.getRole());
            accountService.save(account2);
            return new ResponseEntity<>(HttpStatus.OK);


        }
    }


    @PostMapping("/register")
    public ResponseEntity<?> registerAccount(HttpServletRequest request, @RequestBody @Valid AccountDto accountDTO, BindingResult bindingResult){
        Map<String,String> listError = new HashMap<>();
        Role role = roleService.findIdByRole(2);
        if (bindingResult.hasFieldErrors()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            if (accountService.findAccountByEmail(accountDTO.getEmail()) != null) {
                listError.put("email", "Email Đã Tồn Tại");
            }
            if (accountService.findAccountByPhone(accountDTO.getPhoneNumber()) != null) {
                listError.put("phoneNumber", "Số Điện Thoại Đã Tồn Tại");
            }
            if (accountService.findAccountByAccountName(accountDTO.getAccountName()) != null) {
                listError.put("accountName", "Tài Khoản Đã Tồn Tại");
            }
            if (listError.size() > 0) {
                return new ResponseEntity<>(listError, HttpStatus.BAD_REQUEST);
            }
            String encode = passwordEncoder.encode(accountDTO.getPassword());
            Account account = new Account();
            BeanUtils.copyProperties(accountDTO, account);
            account.setAvatarUser("https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-19.jpg");
//            account.setRole(role);
            account.setPassword(encode);
            accountService.register(account,2);

            return new ResponseEntity<>(account,HttpStatus.OK);
        }

    }
    @PostMapping("/login")
    public ResponseEntity<?> loginAccount(HttpServletRequest response,@RequestBody AccountDto accountDto){
        ApiResponse<Account> apiResponse= new ApiResponse<>();
        try {
            String token= accountService.login(accountDto.getAccountName(),accountDto.getPassword());
            Account account= accountService.findAccountByAccountName(accountDto.getAccountName());
            apiResponse.setToken(token);
apiResponse.setDataRes(account);
            return ResponseEntity.ok(apiResponse);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/find/{id}")
    public ResponseEntity findAccountById(@PathVariable int id){
        Account account = accountService.findAccountById(id);
        if (account == null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity(account,HttpStatus.OK);
        }

    }

}
