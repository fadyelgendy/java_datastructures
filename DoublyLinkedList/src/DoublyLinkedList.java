public class DoublyLinkedList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public DoublyLinkedList () {}

    public DoublyLinkedList (int value) {
        addHead(value);
    }

    public void addHead(int value) {
        Node new_node = new Node(value);

        if (head == null) {
            head = new_node;
            tail = new_node;
        } else {
            head.setPrev(new_node);
            new_node.setNext(head);
            head = new_node;
        }

        size++;
    }

    public void addTail(int value) {
        Node new_node = new Node(value);

        new_node.setPrev(tail);
        tail.setNext(new_node);
        tail = new_node;

        size++;
    }

    public void addIn(int value, int index) {
        Node new_node = new Node(value);
        Node current = head;

        int i = 0;

        while (i < size) {
            if (i == index) {
                new_node.setNext(current);
                new_node.setPrev(current.getPrev());
                current.getPrev().setNext(new_node);
                current.setPrev(new_node);
                break;
            }

            current = current.getNext();
            i++;
        }

        size++;
    }

    public void remove(int value) {
        Node current = head;
        Node target = null;

        while (current != null) {
            if (current.getData() == value) {
                target = current;
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());

                current.setPrev(null);
                current.setNext(null);

                size--;
                break;
            }
            current = current.getNext();
        }

        if (target != null) {
            System.out.printf("[ %d ] Node is removed!\n", target.getData());
        } else {
            System.out.println("Node Not Found!, Nothing is removed!");
        }
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node current = head;

        int i = 0;

        while (current != null) {
            if (i == 0) {
                System.out.printf("[ Head ]==>[ %d ]==>", current.getData());
            } else {
                System.out.printf("[ %d ]==>", current.getData());
            }

            current = current.getNext();
            i++;
        }

        if (this.size == 0) {
            System.out.print("[ Empty List ]");
        } else {
            System.out.print("[ TAIL ]");
        }

        System.out.println();
    }

    public void reverse() {
        Node current = this.head;
        Node prev = null;
        Node temp = null;

        while (current != null) {
            temp = current;
            current = current.getNext();
            temp.setNext(prev);
            temp.setPrev(current);
            prev = temp;
        }

        this.tail = this.head;
        this.head = prev;
    }

    public void printListReverse() {
        Node current = tail;

        int i = size;

        while (current != null) {
            if (i == size) {
                System.out.printf("[ TAIL ]<==[ %d ]", current.getData());
            } else {
                System.out.printf("<==[ %d ]", current.getData());
            }

            current = current.getPrev();
            i--;
        }

        if (this.size == 0) {
            System.out.print("[ Empty List ]");
        } else {
            System.out.print("[ HEAD ]");
        }

        System.out.println();
    }
}
