package com.kob.backend.service.user.account;

import com.kob.backend.pojo.User;

import java.util.Map;

public interface RegisterService {
    public Map<String,String> register(String username,String password, String confirmPassword);
}
