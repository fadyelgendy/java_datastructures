public class MyHashMap {
    private static final int HASH_MAP_SIZE = 100000;
    public int[][] storage;

    public MyHashMap() {
        this.storage = new int[HASH_MAP_SIZE][2];
    }

    public void put(int key, int value) {
        int index = this.hash(key);
        if (this.storage[index][0] != key) {
            this.storage[index][0] = key;
        }

        this.storage[index][1] = value;
    }

    public int get(int key) {
        int index = this.hash(key);
        if (this.storage[index][0] == key) {
            return this.storage[index][1];
        }

        return -1;
    }

    public void remove(int key) {
        int index = this.hash(key);
        if (this.storage[index][0] == key) {
            this.storage[index][0] = -1;
            this.storage[index][1] = -1;
        }
    }

    private int hash(int key) {
        return key % HASH_MAP_SIZE;
    }
}
