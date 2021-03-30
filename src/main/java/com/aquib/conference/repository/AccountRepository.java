package com.aquib.conference.repository;

import com.aquib.conference.model.Account;
import com.aquib.conference.model.ConferenceUserDetails;
import com.aquib.conference.model.VerificationToken;

public interface AccountRepository {
    public Account create (Account account);

    void saveToken(VerificationToken verificationToken);

    VerificationToken findByToken(String token);

    Account findByUsername(String username);

    void createUserDetails(ConferenceUserDetails userDetails);

    void createAuthorities(ConferenceUserDetails userDetails);

    void delete(Account account);

    void deleteToken(String token);
}
