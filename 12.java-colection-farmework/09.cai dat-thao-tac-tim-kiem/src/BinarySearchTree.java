public class BinarySearchTree<E extends Comparable<E>> {
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

    public boolean goRight(E element, E nodeElement){
        return element.compareTo(nodeElement)>0;
    }

    public void insert(E element){
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
        size++;
    }

    public void print(){
        System.out.println(root);
    }

    public void remove(E element){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current.element != element){
            parent = current;
            if(goRight(element, current.element)){
                current = current.right;
            }else {
                current = current.left;
            }
        }

        if(current.left == null){
            if(goRight(element, parent.element)){
                parent.right = current.right;
            }else {
                parent.left = current.right;
            }
        }else {
            leftRightMost(current);
        }
    }

    public void leftRightMost(TreeNode<E> removeNode){
        TreeNode<E> parent = removeNode;
        TreeNode<E> current = removeNode.left;
        while (current.right != null){
            parent = current;
            current = current.right;
        }
        removeNode.element = current.element;
        if(parent != removeNode){
            parent.right = current.left;
        }else {
            parent.left = current.left;
        }
    }

    public void treeTraversal(){
        inOrder(root);
    }

    public void inOrder(TreeNode<E> root){
        if(root.left != null){
            inOrder(root.left);
        }
        System.out.println(root);
        if(root.right != null){
            inOrder(root.right);
        }
    }

    public int getSize(){
        return size;
    }

    public boolean search(E element){
        if (isEmpty()){
            return false;
        }else {
            TreeNode<E> current = root;
            while (current != null){
                if(current.element.equals(element)){
                    return true;
                }
                if(goRight(element,current.element)){
                    current = current.right;
                }else {
                    current = current.left;
                }
            }
            return false;
        }
    }
}
