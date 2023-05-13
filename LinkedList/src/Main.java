public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(1);
        myLinkedList.addTail(2);
        myLinkedList.addTail(3);
        myLinkedList.add(0);
        myLinkedList.addIn(4, 2);

        System.out.println(myLinkedList.getSize());
        myLinkedList.printList();

        // myLinkedList.remove(0);
        // myLinkedList.remove(4);
        // myLinkedList.remove(2);
        // myLinkedList.remove(1);
        // myLinkedList.remove(3);

        System.out.println(myLinkedList.getSize());
        myLinkedList.printList();

        myLinkedList.add(100);

        System.out.println(myLinkedList.getSize());
        myLinkedList.printList();

        myLinkedList.reverse();

        myLinkedList.printList();

    }
}
