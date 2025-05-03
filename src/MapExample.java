import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // 1. Tạo một HashMap
        Map<String, Integer> map = new HashMap<>();

        // 2. put() – Thêm phần tử
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 30);
        System.out.println("Map sau khi put: " + map);

        // 3. get() – Lấy giá trị theo key
        System.out.println("Giá trị của 'banana': " + map.get("banana"));

        // 4. containsKey() – Kiểm tra tồn tại key
        System.out.println("Map có chứa key 'apple'? " + map.containsKey("apple"));

        // 5. containsValue() – Kiểm tra tồn tại value
        System.out.println("Map có chứa giá trị 30? " + map.containsValue(30));

        // 6. remove() – Xoá phần tử theo key
        map.remove("banana");
        System.out.println("Map sau khi remove 'banana': " + map);

        // 7. size() – Đếm số phần tử
        System.out.println("Số phần tử trong map: " + map.size());

        // 8. isEmpty() – Kiểm tra map rỗng
        System.out.println("Map có rỗng không? " + map.isEmpty());

        // 9. keySet() – Lấy danh sách key
        System.out.println("Tập hợp các key: " + map.keySet());

        // 10. values() – Lấy danh sách value
        System.out.println("Tập hợp các value: " + map.values());

        // 11. entrySet() – Duyệt toàn bộ map qua Entry
        System.out.println("Duyệt map bằng entrySet:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        // 12. clear() – Xoá toàn bộ map
        map.clear();
        System.out.println("Map sau khi clear: " + map);
        System.out.println("Map có rỗng không? " + map.isEmpty());
    }
}
