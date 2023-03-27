package com.example.accountmanagement.service;

import com.example.accountmanagement.model.Account;
import com.example.accountmanagement.repository.AccountManageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AccountManageServiceImpl implements AccountManageService{

    @Autowired
    AccountManageRepo accountManageRepo;

    @Override
    public List<Account> findAllAcc(){
        return accountManageRepo.findAll();
    }



}
