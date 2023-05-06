public class Node {
    private char data;

    private Node left = null;

    private Node right = null;

    public Node(char val) {
        this.data = val;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return this.right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setData(char val) {
        this.data = val;
    }

    public char getData() {
        return this.data;
    }
}
