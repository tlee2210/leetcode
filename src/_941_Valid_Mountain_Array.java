public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        boolean check = true;
        int n = arr.length;
        for (int i = 0; (i + 1) < n; i++) {
            int j = i + 1;
            if (arr[i] < arr[j]) {
                if (!check) {
                    return false;
                }
            } else if (arr[i] > arr[j]) {
                if (check) {
                    if (i == 0) {
                        return false;
                    }
                    check = false;
                }
            } else {
                return false;
            }
        }
        if (!check) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }
}
