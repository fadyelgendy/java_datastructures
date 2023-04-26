public class Main {
    public static void main(String[] args) {
        MyHashSet my_hash_set = new MyHashSet();

        my_hash_set.add(1);
        my_hash_set.add(786);

        System.out.println(my_hash_set.contains(1));
    }
}
