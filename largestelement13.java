public class largestelement13 {
    
    public int findLargest(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        largestelement13 s = new largestelement13();
        int[] nums1 = {3, 3, 6, 1};
        System.out.println("Largest: " + s.findLargest(nums1));
        int[] nums2 = {3, 3, 0, 99, -40};
        System.out.println("Largest: " + s.findLargest(nums2));
    }
}

    

