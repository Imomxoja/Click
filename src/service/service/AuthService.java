package service.service;

import service.controller.AuthController;
import service.database.Database;
import service.dto.ResponceDto;
import service.dto.UserDto;
import service.model.User;

public class AuthService {
    public static ResponceDto logIn(UserDto userDto) {
        String phoneNumber = userDto.getPhoneNumber();
        if (phoneNumber == null || phoneNumber.isBlank() || !phoneNumber.matches("\\+998\\d{9}")){
            return new ResponceDto("Phone number required" ,false);
        }

        User user = AuthController.findUserByPhoneNumber(phoneNumber);

        if (user == null){
            return new ResponceDto("User not found" , false);
        }

        String password = userDto.getPassword();
        if (password == null || password.isBlank()){
            return new ResponceDto("Password required", false);
        }

        if (!password.equals(user.getPassword())){
            return new ResponceDto("Password did not match", false);
        }

        ResponceDto response = new ResponceDto("successfully signed in", true);

        response.setUser(user);
        return response;
    }

    public static User findUserByPhoneNumber(String phoneNumber) {
        if (Database.USER_MAP.containsKey(phoneNumber)) {
            return Database.USER_MAP.get(phoneNumber);
        }
        return null;
    }
}
