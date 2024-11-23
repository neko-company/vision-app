package com.nekocompany.visionapp.repository;

import com.nekocompany.visionapp.model.AllowedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllowedUserRepository extends JpaRepository<AllowedUser, String> {
    boolean existsByEmail(String email);
}
