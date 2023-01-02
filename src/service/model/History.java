package service.model;

import java.time.LocalDate;

public class History extends IdCreator{
    private String id;
    private HistoryType historyType;
    private double amount;
    private LocalDate localDate;

    public History(String id, HistoryType historyType, double amount) {
        this.id = id;
        this.historyType = historyType;
        this.amount = amount;
        this.localDate = LocalDate.now();
    }

    @Override
    public String getId() {
        return id;
    }

    public HistoryType getHistoryType() {
        return historyType;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return " history type = " + historyType + ",\n amount = " + amount + ",\n date = " + localDate;
    }
}
