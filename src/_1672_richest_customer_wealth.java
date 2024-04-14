public class _1672_richest_customer_wealth {
    public static int maximumWealth(int[][] accounts) {
        int[] total = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int item : accounts[i]) {
                sum += item;
            }

        }
        int max = 0;
        for (int item : total) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {8, 2, 1}};
        int[][] accounts1 = new int[2][3];
        maximumWealth(accounts);
    }
}
