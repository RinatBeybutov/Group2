package observer;

public class Main {
    public static void main(String[] args) {

        /**
         * Наблюдатель
         */

        Subject subject = new Subject(5);

        subject.attach(new Observer("Ivan", 20));
        subject.attach(new Observer("Alex", 25));
        subject.attach(new Observer("Max", 15));

        subject.notifyObjects("New Post! Happy new year!");

        subject.detach(new Observer("Alex", 25));

        subject.notifyObjects("Greetings! Winter is coming!");
    }
}
