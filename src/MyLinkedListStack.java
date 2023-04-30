import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyLinkedListStack<E>  {
    private LinkedList<E> arr;
    public MyLinkedListStack(){
        arr=new LinkedList<>();
    }
    public void push(E element){
        arr.addFirst(element);
    }
    public Object pop(){
        Object e=arr.getFirst();
        arr.removeFirst();
        return e;
    }
    public Object peek(){
        return arr.getFirst();
    }

}
