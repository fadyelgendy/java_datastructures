public class Node {
    private int data;

    private Node next = null;

    public Node(int val) {
        this.data = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext()
    {
        return this.next;
    }

    public void setData(int val) {
        this.data = val;
    }

    public int getData()
    {
        return this.data;
    }
}
