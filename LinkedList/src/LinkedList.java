public class LinkedList {
    public Node head = null;
    public Node next = null;
    public int size = 0;

    public LinkedList() {
    }

    public LinkedList(int value) {
        this.add(value);
    }

    /*
     * Add New Node, By default added to head
     * With Runtime O(1)
     */
    public void add(int value) {
        Node new_node = new Node(value);

        if (this.head == null) {
            this.head = new_node;
            this.next = null;
        } else {
            new_node.setNext(this.head);
            this.head = new_node;
        }

        this.size++;
    }

    /*
     * Add A given Node to the List Tail
     * With Runtime on O(n)
     */
    public void addTail(int value) {
        Node new_node = new Node(value);

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new_node;
        this.size++;
    }

    /*
     * Add A Node at a given index
     * With Runtime :
     *   - Best case O(2)        => added to head
     *   - Average Case O(n/2)   => Added to Middle
     *   - Worst Case O(n)       => added to tail
     */
    public void addIn(int value, int index) {
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            this.add(value);
            return;
        }

        Node new_node = new Node(value);
        Node current = this.head;

        int i = 0;
        while (i < this.size) {
            if (i == index) {
                new_node.next = current.next;
                current.next = new_node;
            }

            current = current.next;
            ++i;
        }

        this.size++;
    }

    /*
    * Return The List Head
    */
    public Node getHead() {
        return this.head;
    }

    /*
    * Return The Size of the List
    */
    public int getSize() {
        return this.size;
    }

    /*
     * Remove A Given Node
     */
    public void remove(int value) {
        Node current = this.head;
        Node prev = null;

        while (current != null) {
            if (current.getData() == value) {
                Node target = current;
                current = current.getNext();

                if (prev != null) {
                    prev.setNext(current);
                } else {
                    prev = current;
                    this.head = prev;
                }

                target.setNext(null);
                System.out.printf("[%d] Node is removed\n", target.getData());
                break;
            } else {
                prev = current;
                current = current.getNext();
            }
        }

        this.size--;
    }

    /*
    * Visualize The List Contents
    */
    public void printList() {
        Node current = this.head;

        int i = 0;
        while (current != null) {
            if (i == 0) {
                System.out.printf("[ HEAD ]-->[ %d ]", current.getData());
            } else {
                System.out.printf("-->[ %d ]", current.getData());
            }

            current = current.next;
            ++i;
        }

        if (this.size == 0) {
            System.out.print("[ Empty List ]");
        } else {
            System.out.print("-->[ TAIL ]");
        }

        System.out.println();
    }
}
