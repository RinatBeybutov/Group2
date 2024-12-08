import GeneralStack.Cat;

public class HashCodeMain {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik");
        Cat mursik = new Cat("barsik");

        System.out.println(barsik.equals(mursik));
        System.out.println(barsik.hashCode() == mursik.hashCode());

        System.out.printf("min = %d, max = %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);

        /**
         * Коллизия - равенство хэшкодов в случае, когда объекты разные!
         *
         * Если хэшкоды разные, то equals возвращает false
         * Если хэшкоды равные, то не факт, что equals возвращает true
         */

    }
}