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
        Object e=arr.getFirst();
        arr.removeLast();
        return e;
    }
    public Object peek(){
        return arr.getFirst();
    }

}
