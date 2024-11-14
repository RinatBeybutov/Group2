public class Cat {

    // Доступ только из этого класса
    private String name;

    // Доступ из любого места
    public String home = "Москва";

    // Доступ только из текущего пакета и классов-наследников
    protected String country = "Россия";

    // Доступ только из текущего пакета
    String street = "Новорижская";

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name + name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
