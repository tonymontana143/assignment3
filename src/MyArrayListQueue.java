import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayListQueue<E> {
    private ArrayList<E> list;

    // Constructor initializes the instance variable list to a new ArrayList
    public MyArrayListQueue() {
        list = new ArrayList<>();
    }

    // Adds the specified element to the end of the list using the add method of ArrayList
    public void enqueue(E element) {
        list.add(element);
    }

    // Removes and returns the first element of the list using the remove method of ArrayList with the index 0.
    // Throws a NoSuchElementException if the list is empty.
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    // Returns the first element of the list using the get method of ArrayList with the index 0.
    // Throws a NoSuchElementException if the list is empty.
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    // Returns true if the list is empty or false otherwise, using the isEmpty method of ArrayList.
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the number of elements in the list using the size method of ArrayList.
    public int size() {
        return list.size();
    }
}
