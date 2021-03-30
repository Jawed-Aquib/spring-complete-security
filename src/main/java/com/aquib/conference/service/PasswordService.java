package com.aquib.conference.service;

import com.aquib.conference.model.Password;
import com.aquib.conference.model.ResetToken;

public interface PasswordService {

    void createResetToken(Password password, String token);

    boolean confirmResetToken(ResetToken token);

    void update(Password password, String username);

}
