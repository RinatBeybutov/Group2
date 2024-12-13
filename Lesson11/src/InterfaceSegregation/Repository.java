package InterfaceSegregation;

import java.util.List;

public interface Repository {

    // Выделить в отдельный интерфейс UserRepository
    String getUser();
    List<String> getUsers();

    // Выделить в отдельный интерфейс CityRepository
    String getCity();
    List<String> getCities();
}
