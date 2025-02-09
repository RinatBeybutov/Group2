package org.example;

import java.util.HashMap;
import java.util.Map;

public class Service {

    private final Database database;

    private Map<Integer, User> cache = new HashMap<>();

    public Service(Database database) {
        this.database = database;
    }

    public User getUser(int id) {
        // Пробуем получить пользователя из кэша
        if (cache.containsKey(id)) {
            System.out.println("Достали из кэша");
            return cache.get(id);
        }

        // Если кэш пуст, то получаем пользователя из БД
        var user = database.getUser(id);
        // Добавляем пользователя в кэш
        cache.put(id, user);
        return user;
    }

    public User createUser(User user) {
        return database.createUser(user);
    }

    public User updateUser(User newUser) {
        if (cache.containsKey(newUser.getId())) {
            cache.remove(newUser.getId());
        }
        return database.updateUser(newUser);
    }
}
