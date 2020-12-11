import javax.swing.tree.TreeNode;

public class BinarySearchTree<E extends Comparable<E>> {
    public class TreeNode<T> {
        public T element;
        public TreeNode<T> right;
        public TreeNode<T> left;

        public TreeNode(T element){
            this.element = element;
        }

        @Override
        public String toString() {
            return  "element=" + element +
                    ", right=" + right +
                    "| left=" + left ;
        }
    }

    private TreeNode<E> root = null;
    private int size;

    public boolean isEmpty(){
        return root == null;
    }

    public void add(E element){
        TreeNode<E> newNode = new TreeNode<>(element);
        if(isEmpty()){
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
    }

    public void postOrderTraversals(){
        postOrder(root);
    }

    public void postOrder(TreeNode<E> node){
        if(node.left != null) {
            postOrder(node.left);
        }
        if(node.right != null){
            postOrder(node.right);
        }
        System.out.println(node.element);
    }

    public void preOrderTraversals(){
        preOrder(root);
    }

    public void preOrder(TreeNode<E> node){
        System.out.println(node.element);
        if(node.left != null) {
            preOrder(node.left);
        }
        if(node.right != null){
            preOrder(node.right);
        }
    }

    public void inOrderTraversals(){
        inOrder(root);
    }

    public void inOrder(TreeNode<E> node){
        if(node.left != null) {
            inOrder(node.left);
        }
        System.out.println(node.element);   
        if(node.right != null){
            inOrder(node.right);
        }
    }

    public void print(){
        System.out.println(root);
    }

    public boolean goRight(E element, E NodeElement){
        return element.compareTo(NodeElement) > 0;
    }
}
