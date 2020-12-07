public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.print();
        System.out.println("Size :" + myList.size());
        myList.remove(3);
        myList.print();
        System.out.println("Size :" + myList.size());
        System.out.println("Get index 3 : " + myList.get(3));
        System.out.println("Clone :" + myList.clone());
        System.out.println("Contain : " + myList.contains(3));
        System.out.println("indexOf : " + myList.indexOf(3));
    }
}
