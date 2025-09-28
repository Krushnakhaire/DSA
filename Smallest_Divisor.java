public class Smallest_Divisor {

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
    public static void main(String[] args) {
        Smallest_Divisor sd = new Smallest_Divisor();
        int[] nums = {1, 2, 5, 9};
        int limit = 6;
        int result = sd.smallestDivisor(nums, limit);
        System.out.println("Smallest Divisor: " + result); // Output: Smallest Divisor: 5
    }
    
}
