import java.util.ArrayList;

public class MyhashMap {
    private class Data {
        int key;
        int value;

        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                return this.key == ((Data) obj).key;
            }
            return false;
        }
    }

    private final int SIZE = 1000;
    ArrayList<Data> data[];

    public MyhashMap() {
        data = new ArrayList[SIZE];
        for (int i = 0; i < data.length; i++) {
            data[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % 1000;
    }

    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = data[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = data[hashValueIndex];
        Data a = new Data(key, 0);
        bucket.remove(a);
    }

    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = data[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyhashMap map = new MyhashMap();
        map.put(1, 3);
        map.put(2, 3);
        map.remove(2);
        System.out.println(map.get(1));
        map.put(2, 3);

    }
}
