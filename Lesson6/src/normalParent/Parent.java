package normalParent;

import java.io.Serializable;

public class Parent implements Cloneable, Serializable {

    public int age;

    public Parent() {
        System.out.println("Parent");
    }

    @Override
    public Parent clone() {
        try {
            Parent clone = (Parent) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
