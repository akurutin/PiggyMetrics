package com.piggymetrics.auth.service.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceEncoder implements PasswordEncoder {
    private static final int ENCODER_STRANGE = 10;
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(ENCODER_STRANGE);

    @Override
    public String encode(CharSequence charSequence) {
        return encoder.encode(charSequence);
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return encoder.matches(charSequence, s);
    }
}
