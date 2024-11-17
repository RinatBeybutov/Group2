public class Cube {

    private final int side;

    private int count = 0;

    public Cube(int side) {
        this.side = side;
    }

    public void increaseCount() {
        count++;
    }

    public void tryToChangeSide(int side) {
        // Не могу здесь изменить значение side, тк переменная final
        //this.side = side;
        System.out.println(side);
    }

    public void print() {
        System.out.println("Пусто");
    }

    public void print(int a) {
        System.out.println(a);
    }

    public void print(double a) {
        System.out.println(a);
    }


    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", count=" + count +
                '}';
    }
}
