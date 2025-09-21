import java.util.Scanner;

class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int low = 0;
        int high = nums.length - 1;
        int floor = -1, ceil = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == x) {
                floor = ceil = x;
                break;
            } else if (nums[mid] < x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                ceil = nums[mid];
                high = mid - 1;
            }
        }
        
        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        
        Solution solution = new Solution();
        int[] result = solution.getFloorAndCeil(nums, x);
        
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
        
        
    }
}
