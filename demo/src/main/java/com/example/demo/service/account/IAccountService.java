package com.example.demo.service.account;

import com.example.demo.model.Account;
import com.example.demo.service.IGeneralService;


public interface IAccountService extends IGeneralService<Account> {

    Account findAccountByUsername(String username);

    Account findAccountByEmail(String email);

}
