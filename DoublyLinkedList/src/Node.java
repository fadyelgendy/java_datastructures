public class Node {
    private int data;

    private Node next = null;

    private Node prev = null;

    public Node (){}

    public Node (int value) {
        data = value;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
