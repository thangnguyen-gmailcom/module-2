public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<String> bTS = new BinarySearchTree<>();

        bTS.insert("George");
        bTS.insert("George");
        bTS.insert("Michael");
        bTS.insert("Tom");
        bTS.insert("Adam");
        bTS.insert("Jones");
        bTS.insert("Peter");
        bTS.insert("Daniel");

        System.out.println("Inorder (sorted): ");
        bTS.treeTraversal();
        System.out.println("The number of nodes is: " + bTS.getSize());
    }
}
