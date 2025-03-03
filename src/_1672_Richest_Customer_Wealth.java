
public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int total = 0;
        int a = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                a += accounts[i][j];
            }
            total = Math.max(total, a);
            a = 0;

        }
        return total;
    }

//    public static void main(String[] args) {
//        int[][] nums = {{1, 5}, {7, 3}, {3, 5}};
//        System.out.println(maximumWealth(nums));
//    }
}
