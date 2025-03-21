public class _67_Add_Binary {
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            builder.insert(0, sum % 2);
            carry = sum / 2;
        }
        if (carry > 0)
            builder.insert(0, carry);
        return builder.toString();
    }

    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println(addBinary(a, b));
    }
}
