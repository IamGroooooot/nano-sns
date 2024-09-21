package com.nano_sns.nano_sns.user.service;

import com.nano_sns.nano_sns.user.dto.UserDto;

public interface UserService {
    UserDto getUserById(String userId);
}