public class _704_Binary_Search {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int ileft = 0;
        int iright = n - 1;
        while (ileft <= iright) {
            int iMid = (ileft + iright) / 2;
            if (nums[iMid] == target) {
                return iMid;
            } else if (target > nums[iMid]) {
                ileft = iMid + 1;
            } else if (target < nums[iMid]) {
                iright = iMid - 1;
            }
        }
        return -1;
    }

    public static int Bsearch(int[] nums, int target, int ileft, int iright) {
        if (ileft > iright) return -1;
        int iMid = (ileft + iright) / 2;
        if (target == nums[iMid]) {
            return iMid;
        } else if (target > nums[iMid]) {
            return Bsearch(nums, target, iMid + 1, iright);
        } else {
            return Bsearch(nums, target, ileft, iMid - 1);
        }
    }

    public static int Bsearch(int[] nums, int target) {
        int n = nums.length;
        return Bsearch(nums, target, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 0));
    }
}
