package com.sreynoch.repository;

import com.sreynoch.entity.Account;
import com.sreynoch.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {

}
