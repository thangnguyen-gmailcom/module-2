public class BinarySearchTree<E extends  Comparable<E>> {
    public class TreeNode<T>{
        private T element;
        private TreeNode<T> right;
        private TreeNode<T> left;

        public TreeNode(T data){
            this.element = data;
        }

        @Override
        public String toString() {
            return  "element=" + element;
        }
    }
    private TreeNode<E> root = null;
    private int size;

    public void add(E element){
        TreeNode<E> newNode = new TreeNode<>(element);
        if(isEmpty()){
            root = newNode;
        }else{
            TreeNode<E> father = null;
            TreeNode<E> child = root;
            while (child != null){
                father = child;
                if(goRight(element,child.element)){
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

    public boolean goRight(E element, E nodeElement){
        return element.compareTo(nodeElement) > 0;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void print(){
        System.out.println(root);
    }

    public void treeTraversal(){
        preOrder(root);
    }

    public void preOrder(TreeNode<E> node){
        System.out.println(node);
        if(node.left != null) {
            preOrder(node.left);
        }
        if(node.right != null){
            preOrder(node.right);
        }
    }
}

