class Main {
    public static void main(String[] args) {
        // Queue is FIFO [first in first out]
        Queue myQueue = new Queue();

        System.out.println("Empty: " + myQueue.isEmpty()); // true
        System.out.println("Size: " + myQueue.size()); // 0
        System.out.println("Peek: " + myQueue.peek()); // -1

        myQueue.enqueue(1); // [1]
        myQueue.enqueue(100); // [100, 1]
        myQueue.enqueue(3); // [3, 100, 1]

        System.out.println("Empty: " + myQueue.isEmpty()); // false
        System.out.println("Size: " + myQueue.size()); // 3
        System.out.println("Peek: " + myQueue.peek()); // 1

        System.out.println("Dequeued: " + myQueue.dequeue()); // 1
        System.out.println("Dequeued: " + myQueue.dequeue()); // 100

        System.out.println("Empty: " + myQueue.isEmpty()); // false
        System.out.println("Size: " + myQueue.size()); // 1
        System.out.println("Peek: " + myQueue.peek()); // 3

    }
}