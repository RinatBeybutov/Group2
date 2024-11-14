package OOP;

public class Human {
    private String name;
    private String lastName;
    private int age;

    public Human() {
    }

    public Human(String name,
                 String lastName,
                 int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
