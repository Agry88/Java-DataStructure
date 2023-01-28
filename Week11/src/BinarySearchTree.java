class BinarySearchTree {
    class Node {
        int val;
        Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.val)
            root.left = insert(root.left, key);
        else if (key > root.val)
            root.right = insert(root.right, key);

        return root;
    }

    public void preorder() {
        if (root != null) {
            System.out.print("前序的排序為" + root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        } else {
            // make print more readable
            System.out.println();
        }
    }
    
    public void postorder() {
        if (root != null) {
            System.out.print("後序的排序為: ");
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val);
        }
    }

    private void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public void search(int key) {
        Node foundNode = search(root, key);
        if (foundNode != null) {
            System.out.println("Node with key " + key + " found.");
        } else {
            System.out.println("Node with key " + key + " not found.");
        }
    }

    private Node search(Node root, int key) {
        if (root == null || root.val == key) {
            return root;
        }
        if (root.val > key) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    public void minValue() {
        int minVal = minValue(root);
        System.out.println("Minimum value in BST is " + minVal);
    }

    private int minValue(Node root) {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }

    public Node minValueNode(Node root) {
        Node current = root;

        while (current.left != null) {
            current = current.left;
        }
        System.out.println("min=" + current.val);
        return current;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(30);
        tree.insert(50);
        tree.insert(60);

        tree.preorder();
        tree.postorder();

        tree.search(50);
        tree.search(90);
        tree.minValue();

    }
}