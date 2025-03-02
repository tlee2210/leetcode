import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                result.add(num);
                map.put(num, count - 1);
            }
        }
        int[] intersection = new int[result.size()];
        for (int i = 0; i < intersection.length; i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int[] nums2 = {2,2};

    }
}
