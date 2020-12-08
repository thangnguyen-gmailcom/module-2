public class StackClient {
    public static void main(String[] args) throws Exception{
        MyStack stack = new MyStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("size : " + stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("size : " + stack.size());
    }
}
