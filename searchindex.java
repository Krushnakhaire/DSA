import java.util.Scanner;
class searchindex {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Element found: " + nums[i]);
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        searchindex s1 = new searchindex();
        int result = s1.search(nums, target);
        if (result != -1) {
            System.out.println("Index of target element is: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}