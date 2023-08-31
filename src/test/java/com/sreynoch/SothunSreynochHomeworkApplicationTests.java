package com.sreynoch;

import com.sreynoch.entity.AccountType;
import com.sreynoch.repository.AccountTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SothunSreynochHomeworkApplicationTests {
    @Autowired
     private AccountTypeRepository accountTypeRepository;
    @Test
    void contextLoads() {
        AccountType obj = new AccountType();
        obj.setName("Saving");
        AccountType obj2 = new AccountType();
        obj2.setName("Payment");
        accountTypeRepository.saveAll(List.of(obj,obj2));
    }

}
