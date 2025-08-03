import java.util.ArrayList;

public class ArrayList_Monotonic_or_not{
    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                decreasing = false;
            }
            if (list.get(i) < list.get(i - 1)) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);

        System.out.println("Is Monotonic: " + isMonotonic(list)); // Output: true
    }
}
