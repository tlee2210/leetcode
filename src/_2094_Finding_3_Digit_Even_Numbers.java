import java.util.*;

public class _2094_Finding_3_Digit_Even_Numbers {
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> integerSet = new HashSet<>();
        if (digits.length < 3) {
            return new int[0];
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && j != k && i != k) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        if (number % 2 == 0) {
                            integerSet.add(number);
                        }
                    }
                }
            }
        }

        return integerSet.stream().sorted().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
//        int[] nums = {0,7,1};
        int[] nums = {3,4,7,1,4,8,2,3,9,4,1,3,2,4,6,5,2,6,2,7,9,0,9,7,1,3,3,8,0,5,8,9,8,1,5,9,4,6,5,6,1,6,9,2,7,2,2,2,8,3,1,2,6,1,6,1,6,4,5,3,2,3,2,3,0,8,4,9,5,1,6,1,6};
        int[] result = findEvenNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
}
