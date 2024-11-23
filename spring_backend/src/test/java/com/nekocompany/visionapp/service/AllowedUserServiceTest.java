package com.nekocompany.visionapp.service;

import com.nekocompany.visionapp.model.AllowedUser;
import com.nekocompany.visionapp.repository.AllowedUserRepository;
import com.nekocompany.visionapp.service.AllowedUserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AllowedUserServiceTest {

    @Autowired
    private AllowedUserService allowedUserService;

    @MockBean
    private AllowedUserRepository allowedUserRepository;

    @Test
    public void shouldReturnListOfAllowedUsers() {
        // Mock repository response
        Mockito.when(allowedUserRepository.findAll())
                .thenReturn(Arrays.asList(
                        new AllowedUser("user1@example.com"),
                        new AllowedUser("user2@example.com")
                ));

        // Call service method
        List<AllowedUser> result = allowedUserService.getAllAllowedUsers();

        // Validate results
        assertEquals(2, result.size(), "The number of allowed users should be 2");
        assertEquals("user1@example.com", result.get(0).getEmail());
        assertEquals("user2@example.com", result.get(1).getEmail());
    }
}
