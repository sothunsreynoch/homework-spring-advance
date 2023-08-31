package com.sreynoch.service.impl;

import com.sreynoch.entity.AccountType;
import com.sreynoch.repository.AccountTypeRepository;
import com.sreynoch.service.AccountTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountTypeServiceImpl implements AccountTypeService {
    private final AccountTypeRepository accountTypeRepository;

    @Override
    public List<AccountType> findAllAccountType() {
        return accountTypeRepository.findAll();
    }

    @Override
    public AccountType findAllAccountTypeById(Integer id) {
        return accountTypeRepository.findById(id).orElseThrow();
    }
}
