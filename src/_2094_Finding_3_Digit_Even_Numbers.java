import java.util.HashSet;
import java.util.Set;

public class _2094_Finding_3_Digit_Even_Numbers {
    public static int[] findEvenNumbers(int[] digits) {
        if (digits.length < 3) return new int[0];

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0)
                continue;
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


//    public static void main(String[] args) {
//        int[] nums = {2,2,8,8,2};
//        System.out.println(Arrays.toString(findEvenNumbers(nums)));
//    }
}
