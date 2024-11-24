package CustomQuque;

public class CustomQueue {

    private int[] data;
    private int head = 0;
    private int tail = 0;

    public CustomQueue(int capacity) {
        data = new int[capacity];
    }

    public void push(int number) {
        if (tail == data.length) {
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[tail] = number;
        tail++;
    }

    public int pop() {
        if (head == tail) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = data[head];
        head++;
        return result;
    }
}
