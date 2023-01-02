package client.ui;

import client.util.ScannerUtil;
import service.controller.AuthController;
import service.dto.ResponceDto;
import service.dto.UserDto;

public class AuthUI {
    public static void logIn() {
        System.out.print("Write your phone number : ");
        String phoneNumber = ScannerUtil.SCANNER.nextLine();

        System.out.print("Write your password : ");
        String password = ScannerUtil.SCANNER.nextLine();

        UserDto userDto = new UserDto(phoneNumber, password);

        ResponceDto responceDto = AuthController.logIn(userDto);

        if (responceDto.isSuccess()){
            System.out.println();
            System.out.println(responceDto.getAnswer());
            UserUI.userWindow(responceDto.getUser());
        }
        else {
            System.out.println();
            System.out.println(responceDto.getAnswer());
        }
    }
}
