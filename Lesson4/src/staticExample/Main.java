package staticExample;

public class Main {
    public static void main(String[] args) {
        /**
         * Для чего нужен static
         */

        Cat barsik = new Cat("barsik");
        Cat mursik = new Cat("mursik");

        int age = Cat.age;

        //System.out.println("age = " + age);

        Cat.printAge();

        mursik.increaseAge();

        //System.out.println("barsik.getName() = " + barsik.getName());

        Cat.printAge();

        int radius = 2;

        double equation = Constants.PI * 2 * radius;

        int max = Math.max(1, 2);

    }
}