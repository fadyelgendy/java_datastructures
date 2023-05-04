public class DoublyLinkedList {
    private Node head = null;

    private Node tail = null;

    private int size = 0;

    public void add(int val) {
        Node new_node = new Node(val);

        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else {
            new_node.setNext(this.head);
            this.head.setPrev(new_node);
            this.head = new_node;
        }

        this.size++;
    }

    public int remove() {
        Node target = null;

        if (this.tail != null) {
            target = this.tail;
            this.tail = this.tail.getPrev();

            target.setNext(null);
            target.setPrev(null);

            this.size--;

            return target.getData();
        }

        return -1;
    }

    public int getTail() {
        if (this.tail != null) {
            return this.tail.getData();
        }

        return -1;
    }

    public int getSize() {
        return this.size;
    }
}
