package CustomStack;

public class CustomStack {

    private int[] data;
    private int top;

    public CustomStack(int capacity) {
        this.data = new int[capacity];
    }

    public void push(int number) {
        if (top == data.length) {
            resize();
            System.out.println("resize of stack");
        }
        data[top++] = number;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    // Написать метод, который возвращает последний элемент в стеке.
    public int pop() {
        if(top == 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        return data[--top];
    }

}
