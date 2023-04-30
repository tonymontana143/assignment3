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

}
