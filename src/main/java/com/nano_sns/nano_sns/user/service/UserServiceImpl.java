package com.nano_sns.nano_sns.user.service;
import org.springframework.stereotype.Service;

import com.nano_sns.nano_sns.common.exception.UserNotFoundException;
import com.nano_sns.nano_sns.user.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUserById(String userId) {
        // @NOTE: 임시로 데이터 반환
        if ("1".equals(userId)) {
            return new UserDto(
                    "1",
                    "Groot",
                    "I am Groot",
                    "Bio",
                    "http://coding-groot.tistory.com",
                    "https://avatars.githubusercontent.com/u/1234567890?v=4",
                    new UserDto.Counts(123, 456, 789)
            );
        } else {
            throw new UserNotFoundException("User not found");
        }
    }
}