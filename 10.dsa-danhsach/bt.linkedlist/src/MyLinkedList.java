import org.w3c.dom.Node;

public class MyLinkedList<E> {

    public static class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setData(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node<>(data);
        numNodes = 1;
    }

    public void add(int index, E element) {
        Node<E> temp = head;
        Node<E> holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node<E>(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E element) {
        Node<E> temp = head;
        head = new Node<E>(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<E>(element);
        add(numNodes, element);
    }

    public E removeFirst() {
        if (numNodes == 0) return null;
        Node<E> temp = head;
        head = temp.getNext();
        numNodes--;
        return temp.getData();
    }


    public E remove(int index) {
        if(index<0 || index > numNodes){
            return null;
        }else if(index == 0){
            return removeFirst();
        }else {
            Node prevTemp = head;
            for (int i = 0; i < index - 1; i++) {
                prevTemp = prevTemp.next;
            }
            prevTemp.next = prevTemp.next.next;
            numNodes--;
            return null;
        }
    }

    public boolean removeObject(Object e) {
        Node<E> temp = head;
        Node<E> current = head.next;
        while (current != null) {
            if(current.getData().equals(e)){
                temp.setNext(current.getNext());
                return true;
            }
            temp = current;
            current = current.getNext();
            numNodes--;
        }
        return false;
    }

    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null){
            if(temp.getData().equals(o)) return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }
    public int size(){
        return numNodes;
    }

    public boolean contains(E o){
        return indexOf(o) >= 0;
    }


    public boolean add(E e) {
       addLast(e);
       return true;
    }

    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < numNodes ; i++) {
            if(index == i) {
                return temp.getData();
            }
            temp = temp.next;

        }
        return null;
    }

    public E getFirst() {
        return head.getData();
    }

    public E getLast() {
        return get(numNodes-1);
    }

    public void clear() {
        numNodes = 0;
        head = null;
    }


    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
             System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
