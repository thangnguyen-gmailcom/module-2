public class CircularLinkedListTest {
    public static void main(String[] args) {
        CircularLinkedList<Integer> queue = new CircularLinkedList<>();
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        while (!queue.isEmpty()){
            System.out.print(queue.dequeue() + " ");
        }
    }
}
