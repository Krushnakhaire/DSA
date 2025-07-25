import java.util.Scanner;
//most Highest Occurring Element in an Array:
public class hashmap9 {
    public int mostFrequentElement(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }

        int[] freq = new int[max + 1];

        for (int num : nums) {
            freq[num]++;
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i <= max; i++) {
            if (freq[i] > maxFreq || (freq[i] == maxFreq && i < result)) {
                maxFreq = freq[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        hashmap9 s = new hashmap9();
        int ans = s.mostFrequentElement(nums);
        System.out.println(ans);
    }
}
