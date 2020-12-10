public class MyStackTest {
    public static void main(String[] args) {
        Mystack<Integer> mystack = new Mystack<Integer>();

        mystack.push(1);
        mystack.push(3);
        mystack.push(4);
        mystack.push(5);
        mystack.pop();
        System.out.println(mystack.getSize());
        mystack.printStack();

    }
}
