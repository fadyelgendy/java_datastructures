import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinaryTree {
    public static void main(String[] args) {
        Node a = new Node('A');
        Node b = new Node('B');
        Node c = new Node('C');
        Node d = new Node('D');
        Node e = new Node('E');
        Node f = new Node('F');

        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        d.setRight(e);
        c.setRight(f);

        // Depth first Traverse Iteratively
        traverseIterative(a);

        // Breadth first Traverse Iteratively
        traverseBFIterative(a);

        // Traverse Recursively
        traverse(a);
        System.out.println();

        // Find Node, Iteratively
        containsIterative(a, 'X');

        // Find node Recursively
        System.out.println("[X] is in Tree: " + containsRecursive(a, 'X'));
        System.out.println("[E] is in Tree: " + containsRecursive(a, 'E'));
    }

    // Depth first traverse, iterative
    public static void traverseIterative(Node root) {
        if (root == null) return;

        Stack<Node> visisted = new Stack<>();

        visisted.push(root);

        while(visisted.size() != 0) {
            Node current = visisted.pop();
            System.out.printf("%c ", current.getData());

            if (current.getRight() != null) visisted.push(current.getRight());
            if (current.getLeft() != null) visisted.push(current.getLeft());
        }

        System.out.println();
    }

    // Depth First traverse, Recursive
    public static void traverse(Node root) {
        if (root == null) return;

        System.out.printf("%c ", root.getData());

        traverse(root.getLeft());
        traverse(root.getRight());
    }

    // Breadth first traverse, iteratively
    public static void traverseBFIterative(Node root) {
        if (root == null) return;

        Queue<Node> visisted = new LinkedList<>();

        visisted.add(root);

        while(visisted.size() != 0) {
            Node current = visisted.remove();

            System.out.printf("%c ", current.getData());

            if (current.getLeft() != null) visisted.add(current.getLeft());
            if (current.getRight() != null) visisted.add(current.getRight());
        }

        System.out.println();
    }

    // Find node Iteratively
    public static void containsIterative(Node root, char val) {
        if (root == null) {
            System.out.println("false");
            return;
        }

        Queue<Node> visited = new LinkedList<>();
        visited.add(root);

        while(visited.size() != 0) {
            Node current = visited.remove();

            if (current.getData() == val) {
                System.out.println("true");
                return;
            }

            if (current.getLeft() != null) visited.add(current.getLeft());
            if (current.getRight() != null) visited.add(current.getRight());
        }

        System.out.println("false");
    }

    // Find node Recursively
    public static boolean containsRecursive(Node root, char val) {
        if (root == null) {
            return false;
        }

        if (root.getData() == val) {
            return true;
        }

        return containsRecursive(root.getLeft(), val) || containsRecursive(root.getRight(), val);
    }
}