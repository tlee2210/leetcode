import java.util.*;

public class _1122_Relative_Sort_Array {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int num : arr2) {
            if (countMap.containsKey(num)) {
                for (int i = 0; i < countMap.get(num); i++) {
                    resultList.add(num);
                }
                countMap.remove(num);
            }
        }

        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                remaining.add(entry.getKey());
            }
        }

        Collections.sort(remaining);

        resultList.addAll(remaining);

        return resultList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {

    }
}
