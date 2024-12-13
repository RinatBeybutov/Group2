package InterfaceSegregation;

import java.util.List;

public class UserRepository implements Repository {
    @Override
    public String getUser() {
        return "Max";
    }

    @Override
    public List<String> getUsers() {
        return List.of("Max");
    }

    @Override
    public String getCity() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getCities() {
        throw new UnsupportedOperationException();
    }
}
