import java.util.ArrayList;
import java.util.Scanner;
public class checkarrayissortted15 {


    public boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        checkarrayissortted15 s1 = new checkarrayissortted15();
        boolean result = s1.isSorted(nums);
        System.out.println("Is the array sorted? " + result);
    }
}

    


