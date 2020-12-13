public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bTS = new BinarySearchTree<>();

        bTS.add(45);
        bTS.add(23);
        bTS.add(86);
        bTS.add(77);
        bTS.add(3);
        bTS.add(24);
        bTS.add(39);
        bTS.add(16);
        bTS.treeTraversal();
//        bTS.print();
    }
}
