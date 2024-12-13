package OpenClosed;

import java.util.List;

public class UserRepositoryRedis implements UserRepositoy {

    @Override
    public String getUser() {
        System.out.println("Использую Redis");
        return "";
    }

    @Override
    public List<String> getUsers() {
        System.out.println("Использую Redis");
        return List.of();
    }
}
