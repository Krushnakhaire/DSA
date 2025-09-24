import java.util.*;
public class search_sorted_rotated_array {

    public int search(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println("Enter target element:");
        int target = sc.nextInt();
        search_sorted_rotated_array sol = new search_sorted_rotated_array();
        System.out.println("Index of target: " + sol.search(nums, target));
    }
}