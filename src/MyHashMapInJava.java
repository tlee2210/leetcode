import java.util.HashMap;
import java.util.Map;

public class MyHashMapInJava {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                int a = map.get(i);
                map.put(i, ++a);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
