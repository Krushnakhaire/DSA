    import java.util.*;

public class Reaarange_Array_in_positive_negative {


    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < pos.size(); i++) {
            result[idx++] = pos.get(i);
            result[idx++] = neg.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements (even length):");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Reaarange_Array_in_positive_negative sol = new Reaarange_Array_in_positive_negative();
        int[] result = sol.rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}

    

