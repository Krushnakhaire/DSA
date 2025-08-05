 import java.util.*;

public class longest_SubArray {
   

    public int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }

            // Only store the first occurrence of the sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum k: ");
        int k = sc.nextInt();

        longest_SubArray s = new longest_SubArray();
        int result = s.longestSubarray(nums, k);
        System.out.println("Length of longest sub-array with sum " + k + " is: " + result);
    }
}

    

