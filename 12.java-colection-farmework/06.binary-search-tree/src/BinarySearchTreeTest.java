public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bTS = new BinarySearchTree<>();
        bTS.add(100);
        bTS.add(90);
        bTS.add(120);
        bTS.add(95);
        bTS.add(80);
//        bTS.postOrderTraversals();
//        bTS.preOrderTraversals();
        bTS.inOrderTraversals();
//        bTS.print();
    }
}
