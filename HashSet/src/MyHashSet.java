import java.util.ArrayList;

public class MyHashSet {
    private static final int HASH_SET_SIZE = 100000;
    private final ArrayList[] storage;

    public MyHashSet() {
        this.storage = new ArrayList[HASH_SET_SIZE];

        for (int i = 0; i < HASH_SET_SIZE; ++i) {
            this.storage[i] = new ArrayList<Integer>();
        }
    }

    public void add(int key) {
        int index = hash(key);
        if (!this.contains(key)) {
            this.storage[index].add(key);
        }
    }

    public void remove(int key) {
        if (this.contains(key)) {
            int index = this.hash(key);
            this.storage[index].remove((Integer) key);
        }
    }

    public boolean contains(int key) {
        int index = this.hash(key);
        return this.storage[index].contains(key);
    }

    private int hash(int key) {
        return key % HASH_SET_SIZE;
    }
}
