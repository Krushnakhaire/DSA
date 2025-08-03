import java.util.Scanner;

public class Single_Number {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all elements
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an number of elements in nums");

        int n = scanner.nextInt();
        int nums[] = new int[n];
        System.out.println("enter elements in nums " + n);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        Single_Number obj = new Single_Number();
        int result = obj.singleNumber(nums);
        System.out.println("Single number is: " + result);
    }
}