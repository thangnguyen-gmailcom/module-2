public class BinarySearchTree<E> {
    public class TreeNode<T>{
        private T element;
        private TreeNode<T> right;
        private TreeNode<T> left;

        public TreeNode(T data) {
            this.element = data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "element=" + element +
                    ", right=" + right +
                    ", left=" + left +
                    '}';
        }
    }

    private TreeNode<E> root = null;
    private int size;

    public boolean isEmpty(){
        return root == null;
    }

    public boolean goRight(){}

    public void insert(E element){
        TreeNode<E> newNode = new TreeNode<>(element);
        if(isEmpty()){
            root = newNode;
        }else {
            TreeNode<E> father = null;
            TreeNode<E> child = root;
            while (child != null){
                father = child;
            }
        }
    }
}
