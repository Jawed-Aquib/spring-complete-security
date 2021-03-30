package com.aquib.conference.repository;

import com.aquib.conference.model.Password;
import com.aquib.conference.model.ResetToken;

public interface PasswordRepository {
    void saveToken(ResetToken resetToken);

    ResetToken findByToken(String token);

    void update(Password password, String username);
}
