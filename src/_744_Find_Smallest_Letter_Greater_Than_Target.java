public interface _744_Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(left % letters.length);

        return letters[left % letters.length];
    }

    ;

    public static void main(String[] args) {
        char[] letters1 = {'b','d', 'f', 'j'};
        char target1 = 'c';
        System.out.println(nextGreatestLetter(letters1, target1));
    }
}
