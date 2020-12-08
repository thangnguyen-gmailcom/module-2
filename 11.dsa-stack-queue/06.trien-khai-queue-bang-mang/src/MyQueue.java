public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public  boolean isQueueEmpty() {
        boolean status = false;
        if(currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if(isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
        }else {
            if(tail == capacity){
                tail = 0;
            }
            queueArr[tail] = item;
            tail++;
            currentSize++;
            System.out.println("Element " + item + " is pushed to queue");
        }
    }

    public int dequeue() {
        if(isQueueEmpty()) {
            return 0;
        }else {
            int holder = queueArr[head];
            head++;
            currentSize--;
            return holder;
        }
    }

    public void printQueue(){
        int index = head;
        for (int i = 0; i <currentSize ; i++) {
            System.out.println(queueArr[index]);
            index = ++index % capacity;
        }
    }
}