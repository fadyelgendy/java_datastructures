import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
    private Node root = null;

    //   A
    //  / \
    //  B   C
    // / \   \
    // D  E   F

    public BinaryTree() {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);

        this.root = a;
    }

    public Node getRoot() {
        return this.root;
    }

    // Depth first traverse, iterative
    public void traverseIterative(Node root) {
        System.out.println("Depth first traverse, Iterative:");
        if (root == null)
            return;

        Stack<Node> visisted = new Stack<>();

        visisted.push(root);

        while (visisted.size() != 0) {
            Node current = visisted.pop();
            System.out.printf("%c ", current.getData());

            if (current.getRight() != null)
                visisted.push(current.getRight());
            if (current.getLeft() != null)
                visisted.push(current.getLeft());
        }

        System.out.println();
    }

    // Depth First traverse, Recursive
    public void traverse(Node root) {
        if (root == null)
            return;

        System.out.printf("%c ", root.getData());

        traverse(root.getLeft());
        traverse(root.getRight());
    }

    // Breadth first traverse, iteratively
    public void traverseBFIterative(Node root) {
        System.out.println("Breadth first traverse, Iterative:");

        if (root == null)
            return;

        Queue<Node> visisted = new LinkedList<>();

        visisted.add(root);

        while (visisted.size() != 0) {
            Node current = visisted.remove();

            System.out.printf("%c ", current.getData());

            if (current.getLeft() != null)
                visisted.add(current.getLeft());
            if (current.getRight() != null)
                visisted.add(current.getRight());
        }

        System.out.println();
    }

    // Find node Iteratively
    public void containsIterative(Node root, char val) {
        if (root == null) {
            System.out.println("false");
            return;
        }

        Queue<Node> visited = new LinkedList<>();
        visited.add(root);

        while (visited.size() != 0) {
            Node current = visited.remove();

            if (current.getData() == val) {
                System.out.println("true");
                return;
            }

            if (current.getLeft() != null)
                visited.add(current.getLeft());
            if (current.getRight() != null)
                visited.add(current.getRight());
        }

        System.out.println("false");
    }

    // Find node Recursively
    public boolean containsRecursive(Node root, char val) {
        if (root == null) {
            return false;
        }

        if (root.getData() == val) {
            return true;
        }

        return containsRecursive(root.getLeft(), val) || containsRecursive(root.getRight(), val);
    }

    // Sum a tree values, Iteratively
    public int treeSumIterative(Node root) {
        if (root == null)
            return 0;

        int sum = 0;

        Stack<Node> visited = new Stack<>();

        visited.push(root);

        while (visited.size() != 0) {
            Node current = visited.pop();

            sum += current.getData();

            if (current.getLeft() != null)
                visited.push(current.getLeft());
            if (current.getRight() != null)
                visited.push(current.getRight());
        }

        return sum;
    }

    // Tree Sum, Recursive
    public int treeSumRecursive(Node root) {
        if (root == null)
            return 0;
        return root.getData() + treeSumRecursive(root.getLeft()) + treeSumRecursive(root.getRight());
    }

    // Tree Minimum value, iterative
    public int findMinIterative(Node root) {
        if (root == null)
            return 0;

        Stack<Node> visited = new Stack<>();
        visited.push(root);

        // Assume that root is the minimum value, so start with
        int min = root.getData();

        while (visited.size() != 0) {
            Node current = visited.pop();

            if (current.getData() < min)
                min = current.getData();

            if (current.getLeft() != null)
                visited.push(current.getLeft());
            if (current.getRight() != null)
                visited.push(current.getRight());
        }

        return min;
    }

    // Tree Minimum value, recursive
    public int findMinRecursive(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.getData(), Math.min(findMinRecursive(root.getLeft()), findMinRecursive(root.getRight())));
    }

    // Tree Max path sum, recursive
    public int maxPathSum(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        if (root.getRight() == null && root.getLeft() == null)
            return root.getData();

        return root.getData() + Math.max(maxPathSum(root.getLeft()), maxPathSum(root.getRight()));
    }
}