package abstractPac;

public class ParentImpl extends Parent {

    private int age;

    public ParentImpl(int age) {
        this.age = age;
        String name = getName();
        setName("new name");
    }


}
