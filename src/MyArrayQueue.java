public class MyArrayQueue implements IStackQueue {
    private int[] array;
    private int SIZE, head, tail;

    public MyArrayQueue(int size) {
        SIZE = size;
        array = new int[size];
        head = tail = -1;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            if (isEmpty()) {
                head++;
            }
            tail++;
            array[tail] = value;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = array[head];
            head++;
            if (head > tail) {
                head = tail = -1;
            }
        }
        return value;
    }

    public int count() {
        if (!isEmpty()) {
            return tail - head + 1;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return tail == SIZE - 1;
    }

    @Override
    public boolean isEmpty() {
        return (head == -1) && (tail == -1);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = head; i <= tail; i++) {
                System.out.println(array[i] + " ");
            }
            System.out.println();
        }
    }
}
