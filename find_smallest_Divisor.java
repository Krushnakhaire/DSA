public class find_smallest_Divisor {
    class Solution {
    public int smallestDivisor(int[] nums, int limit) {
        int low = 1, high = 0;
        for (int x : nums) high = Math.max(high, x);   

        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;         
            if (ok(nums, limit, mid)) {
                ans = mid;                             
                high = mid - 1;
            } else {
                low = mid + 1;                         
            }
        }
        return ans;
    }

    private boolean ok(int[] nums, int limit, int d) {
        long sum = 0;                                  
        for (int x : nums) {
            sum += (x + d - 1) / d;                    
            if (sum > limit) return false;             
        }
        return true;
    }
}

    
}
