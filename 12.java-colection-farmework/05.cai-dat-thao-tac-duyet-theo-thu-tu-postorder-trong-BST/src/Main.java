public class Main {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.add("George");
        tree.add("Michael");
        tree.add("Tom");
        tree.add("Adam");
        tree.add("Jones");
        tree.add("Peter");
        tree.add("Daniel");
        //traverse tree
        System.out.println("Postorder (sorted): ");
        tree.postorderTraversal();
//        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
