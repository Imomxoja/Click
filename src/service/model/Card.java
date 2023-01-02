package service.model;

public class Card extends IdCreator{
    private String cardNumber;
    private String ownerName;
    private double balance;
    private String cardUserId;

    public Card(String cardNumber, String ownerName, double balance, String cardUserId) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.balance = balance;
        this.cardUserId = cardUserId;
    }

    public String getCardUserId() {
        return cardUserId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return " balance = " + balance;
    }
}
