import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> list;

    public MyArrayListQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(E element) {
        list.add(element);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
