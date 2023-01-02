package client.ui;

import client.util.ScannerUtil;
import service.model.User;

public class UserUI {
    public static void userWindow(User user) {
        while (true) {
            String choose = operation();
            switch (choose) {
                case "1" -> MyCardUI.myCard(user);
                case "0" -> {
                    return;
                }
            }
        }
    }

    public static String operation(){
        System.out.println("1. My card");
        System.out.println("0. Exit");
        System.out.print("Choose one : ");

        return ScannerUtil.SCANNER.nextLine();
    }
}
