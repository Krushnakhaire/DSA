import java.util.Scanner;

public class leftrotatearraybyone16 {

    public void rotateArrayByOne(int[] nums) {
        if (nums.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int firstElement = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstElement;

        System.out.println("Array after left rotation by one: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        leftrotatearraybyone16 s1 = new leftrotatearraybyone16();
        s1.rotateArrayByOne(nums);
    }
}
