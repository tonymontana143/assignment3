import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.LinkedList;

public class MyLinkedListQueue<E> {
    private LinkedList<E> arr;
    public MyLinkedListQueue(){
        arr=new LinkedList<>();
    }
    public void enqueue(E element){
        arr.addLast(element);
    }
    public Object dequeue(){
        if(arr.isEmpty()){
            throw new NoSuchElementException();
        }
        Object e=arr.getFirst();
        arr.removeLast();
        return e;
    }
    public Object peek(){
        if(arr.isEmpty()){
            throw new NoSuchElementException();
        }
        return arr.getFirst();
    }
    public boolean isEmpty(){
        if(arr.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public int size(){
        return arr.size();
    }
}
