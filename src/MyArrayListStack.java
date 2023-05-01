import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private ArrayList<T> stackList; // declare an instance variable of type ArrayList

    public MyArrayListStack() {
        stackList = new ArrayList<T>(); // initialize the instance variable in the constructor
    }

    public void push(T item) {
        stackList.add(item); // add an element to the top of the stack
    }

    public T pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException(); // throw an EmptyStackException if the stack is empty
        }
        return stackList.remove(stackList.size() - 1); // remove and return the top element of the stack
    }

    public T peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException(); // throw an EmptyStackException if the stack is empty
        }
        return stackList.get(stackList.size() - 1); // return the top element of the stack without removing it
    }

    public boolean isEmpty() {
        return stackList.isEmpty(); // return true if the stack is empty or false if it is not
    }

    public int size() {
        return stackList.size(); // return the number of elements in the stack
    }
}
