package service.database;

import service.model.Card;
import service.model.History;
import service.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Database {
    Map<String, User> USER_MAP = new HashMap<>();
    Map<String, Card> CARD_MAP = new HashMap<>();
    List<History> HISTORY_LIST = new ArrayList<>();
}
