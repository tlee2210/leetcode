import java.util.HashSet;
import java.util.Set;

public class _575_Distribute_Candies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> integerMap = new HashSet<>();
        for (int a :
                candyType) {
            integerMap.add(a);
        }
        return Math.min(candyType.length / 2, integerMap.size());
    }


    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};

        System.out.println(distributeCandies(candyType));
    }
}
