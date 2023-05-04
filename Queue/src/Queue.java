public class Queue {
    private DoublyLinkedList data;

    public Queue() {
        this.data = new DoublyLinkedList();
    }

    public boolean isEmpty() {
        return this.data.getSize() == 0;
    }

    public int peek() {
        return this.data.getTail();
    }

    public int size() {
        return this.data.getSize();
    }

    public void enqueue(int val) {
        this.data.add(val);
    }

    public int dequeue() {
        return this.data.remove();
    }
}
