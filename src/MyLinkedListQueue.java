import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> arr; // private field arr of type LinkedList<E> to hold the elements of the queue

    public MyLinkedListQueue() { // constructor to initialize the LinkedList
        arr = new LinkedList<>();
    }

    public void enqueue(E element) { // method to add an element to the end of the queue
        arr.addLast(element);
    }

    public Object dequeue() { // method to remove the element from the front of the queue and return it
        if (arr.isEmpty()) { // throw an exception if the queue is empty
            throw new NoSuchElementException();
        }
        Object e = arr.getFirst(); // get the first element of the queue
        arr.removeLast(); // remove the last element from the queue, which will be the first element that was added
        return e; // return the removed element
    }

    public Object peek() { // method to return the element at the front of the queue without removing it
        if (arr.isEmpty()) { // throw an exception if the queue is empty
            throw new NoSuchElementException();
        }
        return arr.getFirst(); // return the first element of the queue
    }

    public boolean isEmpty() { // method to check if the queue is empty
        if (arr.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size() { // method to return the size of the queue
        return arr.size();
    }
}