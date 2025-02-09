package org.example;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private Map<Integer, User> users = new HashMap<>();
    private int id = 6;

    public Database() {
        fillDb();
    }

    public User getUser(int id) {
        System.out.println("Сделали запрос в бд");
        return users.get(id);
    }

    private void fillDb() {
        users.put(1, new User(1, "Doe"));
        users.put(2, new User(2, "Max"));
        users.put(3, new User(3, "Alex"));
        users.put(4, new User(4, "John"));
        users.put(5, new User(5, "Gabe"));
    }

    public User createUser(User user) {
        int currentId = id++;
        user.setId(currentId);
        users.put(currentId, user);
        return users.get(currentId);
    }

    public User updateUser(User newUser) {
        users.put(newUser.getId(), newUser);
        return users.get(newUser.getId());
    }
}
