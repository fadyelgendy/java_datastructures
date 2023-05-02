public class LinkedList {
    private Node head = null;

    private Node tail = null;

    private int size = 0;

    public int getHead() {
        return this.head != null ? this.head.getData(): -1;
    }

    public int getTail() {
        return this.tail != null ? this.tail.getData(): -1;
    }

    public void add(int val) {
        Node new_node =  new Node(val);

        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            new_node.setNext(this.head);
            this.head = new_node;
        }

        this.size++;
    }

    public int remove() {
        Node target = null;

        if (this.head == null && this.size == 0) {
            return -1;
        }

        target = this.head;
        this.head = this.head.getNext();

        this.size--;

        return target.getData();
    }

    public int getSize() {
        return this.size;
    }
}
