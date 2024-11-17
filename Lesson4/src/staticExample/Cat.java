package staticExample;

public class Cat {

    private String name;

    public static int age = 5;

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name +" " + age;
    }

    public void increaseAge() {
        age++;
    }

    public static void printAge() {
        System.out.println(age);
    }
}
