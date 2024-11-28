package observer;

public class Observer {

    private String name;
    private int age;

    public Observer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void update(String message) {
        String result = String.format("Имя: %s, Получил сообщение: %s", name, message);
        System.out.println(result);
    }
}
