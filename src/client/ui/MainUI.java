package client.ui;

import client.util.ScannerUtil;

public class MainUI {
    public static void main() {
        while (true) {
            String choose = operation();
            switch (choose) {
                case "1" -> AuthUI.logIn();
                case "0" -> {
                    return;
                }
            }
        }
    }

    public static String operation(){
        System.out.println("1. Log in");
        System.out.println("0. Exit");
        System.out.print("Choose one : ");

        return ScannerUtil.SCANNER.nextLine();
    }
}
