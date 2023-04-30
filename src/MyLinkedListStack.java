import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<E>  {
    // Private member variable arr holds the linked list.
    private LinkedList<E> arr;

    // Constructor initializes arr as a new linked list.
    public MyLinkedListStack(){
        arr=new LinkedList<>();
    }

    // Push method adds an element to the top of the stack.
    public void push(E element){
        arr.addFirst(element);
    }

    // Pop method removes and returns the element at the top of the stack.
// If the stack is empty, an EmptyStackException is thrown.
    public Object pop(){
        if (arr.isEmpty()){
            throw new EmptyStackException();
        }
        Object e=arr.getFirst();
        arr.removeFirst();
        return e;
    }

    // Peek method returns the element at the top of the stack without removing it.
// If the stack is empty, an EmptyStackException is thrown.
    public Object peek(){
        if(arr.isEmpty()){
            throw new EmptyStackException();
        }
        return arr.getFirst();
    }

    // isEmpty method returns true if the stack is empty, false otherwise.
    public boolean isEmpty(){
        if(arr.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    // size method returns the number of elements in the stack.
    public int size(){
        return arr.size();
    }
    }