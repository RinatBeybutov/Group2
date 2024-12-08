package FunctionalInterfaces;

public class Dog implements MyInterface, Comparable<Dog> {

    private int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
