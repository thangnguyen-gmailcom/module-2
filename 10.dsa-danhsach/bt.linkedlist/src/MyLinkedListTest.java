
public class MyLinkedListTest {
//12 13 11 1 2 14
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.addLast(5);
        myLinkedList.printList();
        myLinkedList.remove(2);
        myLinkedList.removeObject(4);
        myLinkedList.printList();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(6));
    }
}
