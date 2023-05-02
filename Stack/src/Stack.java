public class Stack {
    private LinkedList data;

    public Stack() {
        this.data = new LinkedList();
    }

    public boolean isEmpty() {
        return this.data.getSize() == 0;
    }

    public int peek() {
        return this.data.getHead();
    }

    public int size() {
        return this.data.getSize();
    }

    public void push(int val) {
        this.data.add(val);
    }

    public int pop() {
        return this.data.remove();
    }
}
