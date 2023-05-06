import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class Main {
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
        ArrayList<Character> visitedIterative = new ArrayList<>();
        traverseIterative(a, visitedIterative);
        System.out.println(visitedIterative.toString());

        // Breadth first Traverse Iteratively
        ArrayList<Character> visitedIterativeBF = new ArrayList<>();
        traverseBFIterative(a, visitedIterativeBF);
        System.out.println(visitedIterativeBF.toString());


        // Traverse Recursively
        ArrayList<Character> visitedRecursive = new ArrayList<>();
        traverse(a, visitedRecursive);
        System.out.println(visitedRecursive.toString());
    }

    // Depth first traverse, iterative
    public static void traverseIterative(Node root, ArrayList<Character> result) {
        Stack<Node> visisted = new Stack<>();

        visisted.push(root);

        while(visisted.size() != 0) {
            Node current = visisted.pop();
            result.add(current.getData());
            if (current.getRight() != null) visisted.push(current.getRight());
            if (current.getLeft() != null) visisted.push(current.getLeft());
        }
    }

    // Depth First traverse, Recursive
    public static void traverse(Node root, ArrayList<Character> result) {
        if (root == null) return;

        result.add(root.getData());

        traverse(root.getLeft(), result);
        traverse(root.getRight(), result);
    }

    // Breadth first traverse, iteratively
    public static void traverseBFIterative(Node root, ArrayList<Character> result) {
        Queue<Node> visisted = new LinkedList<>();

        visisted.add(root);

        while(visisted.size() != 0) {
            Node current = visisted.remove();

            result.add(current.getData());

            if (current.getLeft() != null) visisted.add(current.getLeft());
            if (current.getRight() != null) visisted.add(current.getRight());
        }
    }
}