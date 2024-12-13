package OpenClosed;

import java.util.List;

public class UserRepositoyPOstgres implements UserRepositoy {

    @Override
    public String getUser() {
        System.out.println("Использую PostgreSQL");
        return "";
    }

    @Override
    public List<String> getUsers() {
        System.out.println("Использую PostgreSQL");
        return List.of();
    }
}
