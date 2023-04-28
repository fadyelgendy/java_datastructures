public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList();

        myDLL.addHead(1);
        myDLL.addTail(2);
        myDLL.addTail(3);
        myDLL.addTail(4);
        myDLL.addHead(0);
        myDLL.addHead(20);
        myDLL.addIn(300, 2);

        myDLL.remove(1);

        myDLL.remove(400);

        myDLL.printList();
        myDLL.printListReverse();
    }
}
