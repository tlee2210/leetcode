import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                resultList.add(num);
                set.remove(num);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};

        System.out.println(intersection(nums1, nums2));
    }
}
