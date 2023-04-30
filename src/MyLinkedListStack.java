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
        if (arr.isEmpty()){
            throw new EmptyStackException();
        }
        Object e=arr.getFirst();
        arr.removeFirst();
        return e;
    }
    public Object peek(){
        if(arr.isEmpty()){
            throw new EmptyStackException();
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
