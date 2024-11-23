package com.nekocompany.visionapp.controller;

import com.nekocompany.visionapp.model.AllowedUser;
import com.nekocompany.visionapp.service.AllowedUserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(AllowedUserController.class)
public class AllowedUserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AllowedUserService allowedUserService;

    @Test
    public void shouldReturnListOfAllowedUsers() throws Exception {
        Mockito.when(allowedUserService.getAllAllowedUsers())
                .thenReturn(Arrays.asList(
                        new AllowedUser("neko@gmail.com"),
                        new AllowedUser("mishmish@gmail.com")
                ));

        mockMvc.perform(get("/api/v1/allowed-users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0]").value("neko@gmail.com"))
                .andExpect(jsonPath("$[1]").value("mishmish@gmail.com"));
    }
}
