import java.util.HashMap;

public class _594_Longest_Harmonious_Subsequence {
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int longest = 0;

//        System.out.println("Tập hợp các key: " + map.keySet());
//        System.out.println("Tập hợp các value: " + map.values());

        for (int key : map.keySet()) {

//            System.out.println("longest: " + longest);
//            System.out.println("key: " + map.get(key));
//            System.out.println("key + 1: " + map.get(key + 1));
//            System.out.println("=================================");
            if (map.containsKey(key + 1)) {
                longest = Math.max(longest, map.get(key) + map.get(key + 1));
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        System.out.println(findLHS(nums));
    }
}
