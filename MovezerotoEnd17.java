import java.util.Scanner;

public class MovezerotoEnd17 {
    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        System.out.println("The array after moving zeroes to the end is: ");
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MovezerotoEnd17 s1 = new MovezerotoEnd17();
        s1.moveZeroes(nums);
    }
}
