import java.util.*;

public class _1122_Relative_Sort_Array {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr2) {
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                result.add(num);
            }
            frequencyMap.remove(num);
        }

        List<Integer> remainingElements = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(remainingElements);
        for (int num : remainingElements) {
            int frequency = frequencyMap.get(num);
            for (int i = 0; i < frequency; i++) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {28, 6, 22, 8, 44, 17};
        int[] arr2 = {22, 28, 8, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
}
