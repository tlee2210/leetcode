public class _495_Teemo_Attacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 1) return duration;
        int count = 0;
        int start = timeSeries[0];
        int end = start + duration;

        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] > end) {
                count += end - start;
                start = timeSeries[i];
            }
            end = timeSeries[i] + duration;
        }
        count += end - start;

        return count;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1, 4};
        int duration = 2;

        System.out.println(findPoisonedDuration(timeSeries, duration));
    }
}
