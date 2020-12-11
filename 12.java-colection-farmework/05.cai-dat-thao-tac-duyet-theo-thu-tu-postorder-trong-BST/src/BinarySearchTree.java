import java.util.HashMap;
import java.util.Set;

public class BinarySearchTree<E extends Comparable<E>> {
    public class TreeNode<T>{
        protected T element;
        protected TreeNode<T> left;
        protected TreeNode<T> right;

        public TreeNode(T data) {
            this.element = data;
        }
    }

    private TreeNode<E> root = null;
    private int size = 0;

    public void add(E element){
        TreeNode<E> newNode = new TreeNode<>(element);

        if(root == null){
            root = newNode;
        }else {
            TreeNode<E> father = null;
            TreeNode<E> child = root;
            while (child != null){
                father = child;
                if(goRight(element, child.element)){
                    child = child.right;
                }else {
                    child = child.left;
                }
            }

            if(goRight(element, father.element)){
                father.right = newNode;
            }else {
                father.left = newNode;
            }
        }
        size++;
    }

    public boolean goRight(E data, E nodeElement){
        return data.compareTo(nodeElement) > 0;
    }

    public void postorderTraversal() {
        if (!isEmpty()) postorder(root);
    }

    private void postorder(TreeNode<E> node) {
        if (node.left != null) postorder(node.left);
        if (node.right != null) postorder(node.right);
        System.out.println(node.element);
    }

    public boolean isEmpty(){
        return root == null;
    }
}
