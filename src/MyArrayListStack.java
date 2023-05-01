import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private ArrayList<T> stackList;

    public MyArrayListStack() {
        stackList = new ArrayList<T>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    public T peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }
}
