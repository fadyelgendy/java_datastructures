public class Node {
    private int data;
    private Node next = null;
    private Node prev = null;

    public Node(int val) {
        this.data = val;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int val) {
        this.data = val;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return this.prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
