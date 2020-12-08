public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(11);;
        myQueue.enqueue(12);
        myQueue.enqueue(13);
        myQueue.enqueue(14);
        myQueue.dequeue();

        myQueue.printQueue();
    }
}
