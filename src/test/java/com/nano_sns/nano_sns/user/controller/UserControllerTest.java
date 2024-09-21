package com.nano_sns.nano_sns.user.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.nano_sns.nano_sns.common.exception.UserNotFoundException;
import com.nano_sns.nano_sns.user.dto.UserDto;
import com.nano_sns.nano_sns.user.service.UserService;

@WebMvcTest(value = UserController.class, excludeAutoConfiguration = SecurityAutoConfiguration.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc; // Mock MVC를 사용하여 HTTP 요청 시뮬레이션

    @MockBean
    private UserService userService; // Mock UserService

    @Test
    public void getUserById_ReturnsUser() throws Exception {
        // Arrange: 반환할 사용자 설정
        UserDto userDto = new UserDto(
                "1",
                "Groot",
                "Groot Ko",
                "Bio",
                "http://coding-groot.tistory.com",
                "http://github.com/groot",
                new UserDto.Counts(123, 456, 789)
        );
        when(userService.getUserById("1")).thenReturn(userDto);

        // Act & Assert: GET 요청 시뮬레이션 + 응답 검증
        mockMvc.perform(get("/users/1")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("1"))
                .andExpect(jsonPath("$.username").value("Groot"))
                .andExpect(jsonPath("$.fullName").value("Groot Ko"))
                .andExpect(jsonPath("$.counts.media").value(123))
                .andExpect(jsonPath("$.counts.follows").value(456))
                .andExpect(jsonPath("$.counts.followedBy").value(789));
    }

    @Test
    public void getUserById_UserNotFound() throws Exception {
        // Arrange: 응답 예외 설정
        when(userService.getUserById("999")).thenThrow(new UserNotFoundException("User not found"));

        // Act & Assert: GET 요청 시뮬레이션 + 응답 검증
        mockMvc.perform(get("/users/999")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound())
                .andExpect(jsonPath("$.error").value("User not found"));
    }
}