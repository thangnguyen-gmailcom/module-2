import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        int newCapacity = elements.length * 2 +1;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public boolean add(E element) {
        if(isNull(element)) return false;
        add(size,element);
        return true;
    }

    public void add(int index, E element) {
        if(size == elements.length) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private boolean isNull(Object object){
        return object == null;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size-1]=null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public E clone(){
        ArrayList<Object> arr = new ArrayList<Object>();
        for(int i = 0; i <size; i++){
            arr.add(i, elements[i]);
        }
        return (E) arr;
    }

    public boolean contains(E o){
        for(int i = 0; i < size; i ++) {
            if(o.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public E get(int index){
        checkIndex(index);
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    private void checkIndex(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index : " + index + "out of bounds");
        }
    }

    public void print() {
        System.out.println(Arrays.toString(elements));
    }
}
