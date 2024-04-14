
public class _13_roman_to_integer {
    public static int romanToInt(String s) {
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            switch (s.charAt(i)) {
                case 'M':
                    result[i] = 1000;
                    break;
                case 'D':
                    result[i] = 500;
                    break;
                case 'C':
                    result[i] = 100;
                    break;
                case 'L':
                    result[i] = 50;
                    break;
                case 'X':
                    result[i] = 10;
                    break;
                case 'V':
                    result[i] = 5;
                    break;
                case 'I':
                    result[i] = 1;
                    break;
            }
        }
        int sum = 0;
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] < result[i + 1]) {
                sum -= result[i];
            } else {
                sum += result[i];
            }
        }
        System.out.println(sum);
        return sum + result[result.length - 1];
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
