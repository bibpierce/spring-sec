package com.example.accountmanagement.controller;

import com.example.accountmanagement.model.Account;
import com.example.accountmanagement.service.AccountManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountManageController {

    @Autowired
    AccountManageService accountManageService;

    @GetMapping("/findAllAcc")
    public ResponseEntity<List<Account>> findAllAcc(){
        return new ResponseEntity<>(accountManageService.findAllAcc(), HttpStatus.OK);
    }
}
