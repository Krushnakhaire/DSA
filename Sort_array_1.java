import java.util.Scanner;

public class Sort_array_1 {

    public static void sortZeroOneTwo(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements (only 0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] != 0 && nums[i] != 1 && nums[i] != 2) {
                System.out.println("Invalid input! Please enter only 0, 1, or 2.");
                i--;
            }
        }

        sortZeroOneTwo(nums);

        System.out.println("Sorted array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
