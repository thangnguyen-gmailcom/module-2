import org.w3c.dom.Node;

public class CircularLinkedList<E> {

    public class Node<T> {
        private T data;
        private Node<T> link;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getLink() {
            return link;
        }

        public void setLink(Node<T> link) {
            this.link = link;
        }
    }

    private Node<E> front = null;
    private Node<E> rear = null;
    private int numNodes = 0;

//    public void enQueue(E element) {
//        Node<E> newNode = new Node<E>(element);
//        if(front == null) {
//            front = rear = newNode;
//        }else {
//            rear.setLink(newNode);
//            rear = newNode;
//        }
//        rear.setLink(front);
//        numNodes++;
//    }

//    public E dequeue() {
//        if(front == null) {
//            return null;
//        }
//        Node<E> holder = front;
//        if(front == rear) {
//            front = rear = null;
//        }else {
//            front = front.getLink();
//            rear.setLink(front);
//        }
//        numNodes--;
//        return holder.getData();
//    }

    public int size() {
        return numNodes;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(E element) {
        Node<E> newNode = new Node<>(element);
        if(front == null) {
            front = newNode;
            rear = newNode;
        }else {
            rear.setLink(newNode);
            rear = newNode;
        }
        rear.setLink(front);
        numNodes++;
    }

    public E dequeue() {
        Node<E> temp = front;
        if(front == null) {
            return null;
        }
        if(front == rear) {
            front = rear = null;
        }else {
            front = front.getLink();
            rear.setLink(front);
        }
        numNodes--;
        return temp.getData();
    }
}
