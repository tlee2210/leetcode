import java.util.ArrayList;

public class _705_Design_HashSet {
    private final int size = 1000;
    private ArrayList<Integer> myBuckets[];

    public void MyHashSet() {
        myBuckets = new ArrayList[size];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        return bucket.contains(key);
    }
}
