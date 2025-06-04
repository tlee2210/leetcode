public class _1346_Check_If_N_and_Its_Double_Exist {
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int a = arr[i] * 2;

            for (int j = 0; j < n; j++) {
                if (i != j && arr[j] == a) {

                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] nums = {10, 2, 5, 3};

        System.out.println(checkIfExist(nums));
    }
}
