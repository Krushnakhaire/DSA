import java.util.Scanner;
public class Count_Occurances {
    public int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number to count:");
        int target = sc.nextInt();

         Count_Occurances s1 = new Count_Occurances();
        int result = s1.countOccurrences(arr, target);

        System.out.println("Occurrences of target " + target + ": " + result);
    }
}

    
