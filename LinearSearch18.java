import java.util.Scanner;
public class LinearSearch18 {

    public int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found.");
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        LinearSearch18 s1 = new LinearSearch18();
        s1.linearSearch(nums, target);
    }
}

    

