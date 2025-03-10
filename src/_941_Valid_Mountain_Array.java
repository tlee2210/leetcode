public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean bIsIncreasing = true;

        for (int i = 0; (i + 1) < arr.length; i++) {
            int j = i + 1;
            if (arr[i] > arr[j]) {
                if (bIsIncreasing) {
                    if (i == 0) {
                        return false;
                    }
                    bIsIncreasing = false;
                }
            } else if (arr[i] < arr[j]) {
                if (!bIsIncreasing) return false;
            } else
                return false;
        }

        if (!bIsIncreasing) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
