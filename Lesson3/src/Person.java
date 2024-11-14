public class Person {
    private String name;
    private int age;
    private int schoolClass;
    private Cat cat;
    private boolean isMarried;
    private boolean isMale;
    // Не очень информативное
    private boolean gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public void increaseClass() {
        this.schoolClass++;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Cat getCat() {
        return cat;
    }
}
