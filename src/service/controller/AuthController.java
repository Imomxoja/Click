package service.controller;

import service.dto.ResponceDto;
import service.dto.UserDto;
import service.model.User;
import service.service.AuthService;

public class AuthController {
    public static ResponceDto logIn(UserDto userDto) {
        return AuthService.logIn(userDto);
    }

    public static User findUserByPhoneNumber(String phoneNumber) {
        return AuthService.findUserByPhoneNumber(phoneNumber);
    }
}
