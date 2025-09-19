 import java.util.*;
public class UpperBound {
   


    public int upperBound(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        UpperBound s1 = new UpperBound();
        int result = s1.upperBound(nums, n, target);
        System.out.println("Upper Bound Index: " + result);
    }
}

    

