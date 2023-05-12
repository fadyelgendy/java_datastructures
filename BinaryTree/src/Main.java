public class Main {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();

        // Depth first Traverse Iteratively
        myTree.traverseIterative(myTree.getRoot());

        // Breadth first Traverse Iteratively
        myTree.traverseBFIterative(myTree.getRoot());

        // Traverse Recursively
        System.out.println("Depth first traverse, Recursive:");
        myTree.traverse(myTree.getRoot());
        System.out.println();

        // Find Node, Iteratively
        myTree.containsIterative(myTree.getRoot(), 'X');

        // Find node Recursively
        System.out.println("[X] is in Tree: " + myTree.containsRecursive(myTree.getRoot(), 'X'));
        System.out.println("[E] is in Tree: " + myTree.containsRecursive(myTree.getRoot(), 'E'));

        // Tree Sum, iterative
        System.out.println("Tree Sum is: " + myTree.treeSumIterative(myTree.getRoot()));

        // Tree Sum, Recursive
        System.out.println("Tree Sum is: " + myTree.treeSumRecursive(myTree.getRoot()));

        // Tree minimum value, Iterative
        System.out.println("Tree minimum is: " + myTree.findMinIterative(myTree.getRoot()));

        // Tree minimum value, recursive
        System.out.println("Tree minimum is: " + myTree.findMinRecursive(myTree.getRoot()));

        // Max Path Sum, recursive
        System.out.println("Max path is: " + myTree.maxPathSum(myTree.getRoot()));
    }
}
