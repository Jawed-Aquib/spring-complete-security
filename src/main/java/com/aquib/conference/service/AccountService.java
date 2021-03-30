package com.aquib.conference.service;

import com.aquib.conference.model.Account;

public interface AccountService {

    public Account create (Account account);

    void createVerificationToken(Account account, String token);

    void confirmAccount(String token);
}
