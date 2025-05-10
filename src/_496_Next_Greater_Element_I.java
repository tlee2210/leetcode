import java.util.Arrays;

public class _496_Next_Greater_Element_I {
    public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] count = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (j + 1 < nums2.length) {
                        int idx = j + 1;
                        // count[i] = (j + 1) != nums2.length && nums2[j] < nums2[j + 1] ? nums2[j + 1]
                        // : -1;

                        while (idx < nums2.length) {
                            if (idx + 1 > nums2.length) {
                                count[i] = -1;
                            } else {
                                if (nums1[i] < nums2[idx]) {
                                    count[i] = nums2[idx];
                                    break;
                                }
                            }
                            idx++;
                        }

                        if (count[i] == 0) {
                            count[i] = -1;
                        }
                    } else {
                        count[i] = -1;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2}, nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
