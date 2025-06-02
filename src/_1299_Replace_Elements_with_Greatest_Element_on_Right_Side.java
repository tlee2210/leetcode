public class _1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (i != n - 1) {
                arr[i] = Math.max(arr[i], arr[i + 1]);
            }
        }

        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }

        arr[n - 1] = -1;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};

        System.out.println(replaceElements(arr));
    }
}
