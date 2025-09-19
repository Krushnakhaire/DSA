import java.util.*;
public class LowerBound {
    public int LowerBound(int arr[], int target, int n) {
        int low = 0;
        int high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        LowerBound lb = new LowerBound();
        int result = lb.LowerBound(arr, target, n);
        System.out.println("the lower bound of the target element is at index:" + result);
    }
}