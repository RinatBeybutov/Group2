package InterfaceSegregation;

import java.util.List;

public class CityRepository implements Repository{
    @Override
    public String getUser() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> getUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getCity() {
        return "Moscow";
    }

    @Override
    public List<String> getCities() {
        return List.of("Moscow");
    }
}
