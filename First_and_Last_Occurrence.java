import java.util.Scanner;

public class First_and_Last_Occurrence {

    public static int[] searchRange(int[] nums, int target) {
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }

        return new int[] {start, end};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (sorted):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        int[] result = searchRange(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
