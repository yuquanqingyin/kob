package com.kob.backend.controller.user.account;


import com.kob.backend.service.user.account.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/user/account/token/")
    public Map<String, String> getToken(@RequestParam Map<String, String> map){
        String username=map.get("username");
        String password=map.get("password");
//        System.out.println("getToken-用户名：" + username);
//        System.out.println("getToken-密码：" + password);
//        System.out.println(loginService.getToken(username,password));
        return loginService.getToken(username,password);
    }
}
