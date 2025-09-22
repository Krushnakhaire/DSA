public class FirstLastOccurrence {

    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                first = i;
                break;
            }
        }

        if (first == -1) {
            return new int[] {-1, -1};
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                last = i;
                break;
            }
        }

        return new int[] {first, last};
    }

    public static void main(String[] args) {
        FirstLastOccurrence obj = new FirstLastOccurrence();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = obj.searchRange(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = obj.searchRange(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }
}
