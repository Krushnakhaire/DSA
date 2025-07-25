  import java.util.*;
public class secondlargestelement14 {

    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements might be same).");
            return -1;
        }

        return secondLargest;
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

        secondlargestelement14 s1 = new secondlargestelement14();
        int result = s1.secondLargestElement(nums);
        System.out.println("Second largest element is: " + result);
    }
}

    

