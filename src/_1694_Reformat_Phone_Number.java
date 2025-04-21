public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        number = number.replaceAll("[ -]", "");
        return merga(number);
    }

    public static String merga(String s) {
        int n = s.length();
        if (n <= 3) {
            return s;
        } else if (n == 4) {
            return s.substring(0, 2) + "-" + s.substring(2);
        }
        return s.substring(0, 3) + "-" + merga(s.substring(3));
    }

    public static void main(String[] args) {
        String number = "1-23-45 6";

        System.out.println(reformatNumber(number));
    }
}
