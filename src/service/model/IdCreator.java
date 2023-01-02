package service.model;

public abstract class IdCreator {
    protected String id;
    private int idCounter = 0;

    public IdCreator() {
        idCounter++;
        id = String.valueOf(idCounter);
    }

    public String getId() {
        return id;
    }
}
