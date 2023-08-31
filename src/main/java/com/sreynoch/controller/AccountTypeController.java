package com.sreynoch.controller;

import com.sreynoch.entity.AccountType;
import com.sreynoch.service.AccountTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/accountTypes")
@RequiredArgsConstructor
@Slf4j
public class AccountTypeController {

    private final AccountTypeService accountTypeService;

    @GetMapping
    public ResponseEntity<List<AccountType>> findAllAccountTypes(){
        List<AccountType> accountTypes = accountTypeService.findAllAccountType();
        return ResponseEntity.ok(accountTypes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<AccountType>findAllAccountTypeById(@PathVariable Integer id){
        AccountType accountType = accountTypeService.findAllAccountTypeById(id);
        return ResponseEntity.ok(accountType);
    }

}
