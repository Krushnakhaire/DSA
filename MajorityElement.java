public class MajorityElement {
    class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate; 
    }

    public static void main(String[] args) {
        MajorityElement sol = new  MajorityElement();

        int[] nums1 = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println("Majority Element: " + sol.MajorityElement(nums1));

      
    }
}


    
}
