import java.util.*;
import java.util.stream.Collectors;

public class _349_Intersection_of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> resultList = Arrays.stream(nums2)
                .filter(num -> set.contains(num))
                .peek(num -> set.remove(num)) // vừa kiểm tra, vừa remove luôn
                .boxed()
                .collect(Collectors.toList());

        int[] result = resultList.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
