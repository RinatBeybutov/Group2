package GeneralStack;

import java.util.Objects;

public class Cat extends Animal implements Comparable<Cat> {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
