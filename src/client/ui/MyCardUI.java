package client.ui;

import client.util.ScannerUtil;
import service.database.Database;
import service.model.Card;
import service.model.History;
import service.model.HistoryType;
import service.model.User;

public class MyCardUI {
    public static void myCard(User user) {
        while (true) {
            String choose = operation();
            switch (choose) {
                case "1" -> showBalance(user);
                case "2" -> transfer(user);
                case "3" -> operationHistory(user);
                case "0" -> {
                    return;
                }
            }
        }
    }

    private static void showBalance(User user) {
        if (Database.CARD_MAP.containsKey(user.getPhoneNumber())) {
            System.out.println(Database.CARD_MAP.get(user.getPhoneNumber()));
        }
    }

    private static void transfer(User user) {
        System.out.print("Write receiver phone number : ");
        String phoneNumber = ScannerUtil.SCANNER.nextLine();

        if (Database.CARD_MAP.containsKey(phoneNumber)) {
            Card card = Database.CARD_MAP.get(phoneNumber);
            Card card1 = Database.CARD_MAP.get(user.getPhoneNumber());

            if (card.equals(card1)) {
                System.out.println();
                System.out.println("Error ❌");
                System.out.println();
                return;
            }

            System.out.print("Write sending amount : ");
            double amount = ScannerUtil.SCANNER_NUM.nextDouble();

            if (amount <= 0) {
                System.out.println();
                System.out.println("please, send positive amount");
                System.out.println();
                return;
            }

            if (amount > card1.getBalance()) {
                System.out.println();
                System.out.println("not enough money");
                System.out.println();
                return;
            }

            card1.setBalance(card1.getBalance() - amount);
            card.setBalance(card.getBalance() + amount);


            Database.HISTORY_LIST.add(new History(card1.getCardUserId(), HistoryType.CREDIT, amount));
            Database.HISTORY_LIST.add(new History(card.getCardUserId(), HistoryType.DEBIT, amount));

            System.out.println();
            System.out.println("amount sending ✔");
            System.out.println();

        }
    }

    private static void operationHistory(User user) {

        for (History history : Database.HISTORY_LIST) {
            if (history.getId().equals(user.getPhoneNumber())) {
                System.out.println();
                System.out.println(history);
                System.out.println();
            }
        }

        if (Database.HISTORY_LIST.isEmpty()) {
            System.out.println();
            System.out.println("No histories");
            System.out.println();
        }

    }

    public static String operation() {
        System.out.println("1. show balance");
        System.out.println("2. transfer");
        System.out.println("3. operation history");
        System.out.println("0. Exit");
        System.out.print("Choose one : ");

        return ScannerUtil.SCANNER.nextLine();
    }
}
