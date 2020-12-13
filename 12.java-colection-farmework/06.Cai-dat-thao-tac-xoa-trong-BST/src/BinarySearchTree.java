import org.w3c.dom.Node;

public class BinarySearchTree<E extends Comparable<E>> {
    public class TreeNode<T>{
        protected T element;
        protected TreeNode<T> right;
        protected TreeNode<T> left;

        public TreeNode(T data){
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

    public void add(E element){
        TreeNode<E> newNode = new TreeNode<>(element);
        if(isEmpty()){
            root = newNode;
        }else {
            TreeNode<E> farther = null;
            TreeNode<E> child = root;
            while (child != null){
                farther = child;
                if(goRight(element, child.element)){
                    child = child.right;
                }else {
                    child = child.left;
                }
            }
            if(goRight(element,farther.element)){
                farther.right = newNode;
            }else {
                farther.left = newNode;
            }
        }
        size++;
    }

    public void print(){
        System.out.println(root);
    }

    public boolean goRight(E element, E Node){
        return element.compareTo(Node)>0;
    }

    public void delete(E element) {
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
        TreeNode<E> child = removeNode.left;
        System.out.println("Node con remove:" + child.element);
        while (child.right != null){
            parent = child;
            child = child.right;
        }
        System.out.println("Node father of RM:" + parent.element);
        System.out.println("Node RM:" +child.element);
        removeNode.element = child.element;
        if(parent != removeNode){
            parent.right = child.left;
        }else {
            parent.left = child.left;
        }
    }
}
