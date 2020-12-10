import java.util.EmptyStackException;
import java.util.LinkedList;

public class Mystack<E> {
    private LinkedList<E> stack = new LinkedList<>();
    private int size;

    public Mystack(){}

    public void push(E element) {

        stack.addLast(element);
    }

    public E pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int getSize(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public void printStack(){
            System.out.println(stack);
    }
}