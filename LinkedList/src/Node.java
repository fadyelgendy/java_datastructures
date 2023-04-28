public class Node {
    public int data;

    public Node next = null;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }

    public void setData(int value) {
        this.data = value;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getNext()
    {
        return this.next;
    }
}
