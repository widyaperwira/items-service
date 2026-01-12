package com.example.items.service;

import com.example.items.dto.LoginRequest;
import com.example.items.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest request);
}
