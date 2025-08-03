import java.util.ArrayList;
public class Arraylist_pair_sum_2 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        // Find the breaking point (where the array is rotated)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = (bp + 1) % n; // smallest
        int rp = bp;           // largest

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list, 16));
    }
}