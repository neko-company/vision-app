package com.nekocompany.visionapp.service;

import com.nekocompany.visionapp.model.AllowedUser;
import com.nekocompany.visionapp.repository.AllowedUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllowedUserService {

    @Autowired
    private AllowedUserRepository allowedUserRepository;

    public List<AllowedUser> getAllAllowedUsers() {
        return allowedUserRepository.findAll();
    }
}
