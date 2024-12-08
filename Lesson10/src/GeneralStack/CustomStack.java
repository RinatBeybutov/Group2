package GeneralStack;

public class CustomStack <T> {

    private Object[] data;
    private int top;

    public CustomStack(int capacity) {
        this.data = new Object[capacity];
    }

    public void push(T value) {
        if (top == data.length) {
            resize();
            System.out.println("resize of stack");
        }
        data[top++] = value;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    // Написать метод, который возвращает последний элемент в стеке.
    public T pop() {
        if(top == 0) {
            System.out.println("Stack is empty.");
            return null;
            //throw new EmptyStackException();
        }
        return (T)data[--top];
    }

}
