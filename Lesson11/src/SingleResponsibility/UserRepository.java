package SingleResponsibility;

import java.util.List;

/**
 * Этот класс отвечает за получение пользователей
 * из базы данных
 */
public class UserRepository {

    // Код необходимый для создание единственного экземпляра класса
    private static UserRepository instance = new UserRepository();

    private UserRepository() {
    }

    public static UserRepository getInstance() {
        return instance;
    }

    // Код необходимый для получения пользователя из базы данных
    public String getUser(Integer id) {
        // Код необходимый для получения пользователя из базы данных
        return "Max";
    }

    public List<String> getUsers() {
        // Код необходимый для получения списка пользователей из базы данных
        return List.of("Max", "Mike", "John");
    }
}
