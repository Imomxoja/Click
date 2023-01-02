import client.ui.MainUI;
import service.database.Database;
import service.model.Card;
import service.model.User;

public class Application {

    static {
        User user = new User("+998970347585", "0901");
        Database.USER_MAP.put(user.getPhoneNumber(), user);
        Card card = new Card("8600123456789800", "imomxo'ja", 500000, user.getPhoneNumber());
        Database.CARD_MAP.put(user.getPhoneNumber(), card);

        User user1 = new User("+998997895680", "1234");
        Database.USER_MAP.put(user1.getPhoneNumber(), user1);
        Card card1 = new Card("8600980012345678", "Sherbek", 100.000, user1.getPhoneNumber());
        Database.CARD_MAP.put(user1.getPhoneNumber(), card1);
    }

    public static void main(String[] args) {
        MainUI.main();
    }
}
