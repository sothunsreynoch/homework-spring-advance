package com.sreynoch.service;

import com.sreynoch.entity.AccountType;

import java.util.List;

public interface AccountTypeService {
    List<AccountType> findAllAccountType();
    AccountType findAllAccountTypeById(Integer id);
}
