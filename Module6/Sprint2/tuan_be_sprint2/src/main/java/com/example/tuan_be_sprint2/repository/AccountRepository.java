package com.example.tuan_be_sprint2.repository;

import com.example.tuan_be_sprint2.model.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
    Optional<Account> findByAccountName(String accountName);

    @Query(value = "select a.* from account a where a.email = :email   limit 1",nativeQuery = true)
    Account findAccountByEmail(@Param("email") String email);
    @Query(value = "select a.* from account a where a.phone_number = :phone   limit 1",nativeQuery = true)
    Account findAccountByPhone(@Param("phone") String phone);
    @Query(value = "select a.* from account a where a.account_name = :accountName  limit 1",nativeQuery = true)
    Account findAccountByAccountName(@Param("accountName") String accountName);
    @Query(value = "select a.* from account a where a.password = :password limit 1",nativeQuery = true)
    Account findAccountByPassword(@Param("password") String password);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO account (account_name, avatar_user, birthday, email, full_name, gender, id_card, password, phone_number, role_id) " +
            "values (:#{#account.accountName},:#{#account.avatarUser},:#{#account.birthday},:#{#account.email},:#{#account.fullName},:#{#account.gender},:#{#account.idCard},:#{#account.password},:#{#account.phoneNumber} , :role)",nativeQuery = true)
    void register(@Param("account") Account account,@Param("role") int role);
}
