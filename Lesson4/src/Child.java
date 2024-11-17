import staticExample.Cat;

public class Child extends Ancestor {

    private final Cat cat;

    public Child(Cat cat) {
        super(3, "child");
        this.cat = cat;
    }

    public void updateCat() {
        cat.increaseAge();
    }

    @Override
    public void print() {
        //this.name;
        String protectedName1 = this.protectedName;

        String name = this.getName();

        super.print();
    }

    // Не смогу переопределить в классах - наследниках
    public final void printCat() {
        System.out.println(cat);
    }
}
