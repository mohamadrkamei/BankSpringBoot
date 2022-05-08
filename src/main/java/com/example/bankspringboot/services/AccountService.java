package com.example.bankspringboot.services;

import com.example.bankspringboot.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bankspringboot.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    public AccountRepository accountRepository;

public void save(Long ammount){

    Account account =new Account();
    account.setAmount(ammount);
    accountRepository.save(account);
}

}
