package com.example.accountmanagement.service;

import com.example.accountmanagement.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountManageService{

    public List<Account> findAllAcc();
}
