public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int[] total = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    total[i] = 1000;
                    break;
                case 'D':
                    total[i] = 500;
                    break;
                case 'C':
                    total[i] = 100;
                    break;
                case 'L':
                    total[i] = 50;
                    break;
                case 'X':
                    total[i] = 10;
                    break;
                case 'V':
                    total[i] = 5;
                    break;
                case 'I':
                    total[i] = 1;
                    break;
            }
        }
        int sum = 0;
        int length = total.length;
        for (int i = 0; i < total.length - 1; i++) {
            if (total[i] < total[i + 1]) {
                sum -= total[i];
            } else {
                sum += total[i];
            }
        }
        return sum + total[total.length - 1];
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }
}
