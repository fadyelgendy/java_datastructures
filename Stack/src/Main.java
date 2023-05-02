public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        System.out.println(myStack.isEmpty());

        myStack.push(1);
        myStack.push(2);

        System.out.println(myStack.isEmpty());

        System.out.println(myStack.peek());
        System.out.println(myStack.size());

        System.out.println(myStack.pop());

        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }
}