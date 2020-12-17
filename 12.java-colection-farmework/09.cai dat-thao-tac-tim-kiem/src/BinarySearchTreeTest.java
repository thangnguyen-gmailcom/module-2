public class BinarySearchTreeTest {
    public static void main(String[] args) {
        //create a BST
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //travers
        System.out.println(tree.search("Adam"));
        System.out.println(tree.search("Aaaaaaaaa"));
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
