package com.phong.book.auth;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public void register(@Valid RegistrationRequest request) {
    }
}
