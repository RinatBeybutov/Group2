package CustomQuque;

public class Main {
    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue(3);

        customQueue.push(1);
        customQueue.push(2);
        customQueue.push(3);

        System.out.println("customQueue.pop() = " + customQueue.pop());
        System.out.println("customQueue.pop() = " + customQueue.pop());
        System.out.println("customQueue.pop() = " + customQueue.pop());

        customQueue.push(4);
        System.out.println("customQueue.pop() = " + customQueue.pop());

        int[] ints = {1, 2, 3, 4};

    }
}
