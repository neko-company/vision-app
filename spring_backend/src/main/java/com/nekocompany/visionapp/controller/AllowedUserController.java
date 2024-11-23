package com.nekocompany.visionapp.controller;

import com.nekocompany.visionapp.model.AllowedUser;
import com.nekocompany.visionapp.service.AllowedUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/allowed-users")
public class AllowedUserController {

    @Autowired
    private AllowedUserService allowedUserService;

    @GetMapping
    public List<AllowedUser> getAllowedUsers() {
        return allowedUserService.getAllAllowedUsers();
    }
}
