import java.util.*;
public class squareroot_of_number {
    public int floorSqrt(int n) {
        int low = 1;
        int high = n;
        int ans = 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            long square = (long) mid * mid;  

            if (square <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        squareroot_of_number obj = new squareroot_of_number();
        
        int number = 16; 
        int result = obj.floorSqrt(number);
        System.out.println("The floor square root of " + number + " is: " + result);

        number = 28; 
        result = obj.floorSqrt(number);
        System.out.println("The floor square root of " + number + " is: " + result);
    }
}
