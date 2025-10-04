public class LargestOddNumberFinder {
 

    public String largeOddNum(String s) {
        int j = -1;

        for (int k = s.length() - 1; k >= 0; k--) {
            int digit = s.charAt(k) - '0';
            if (digit % 2 == 1) {
                j = k;
                break;
            }
        }

        if (j == -1) return "";

        int i = 0;
        for (; i <= j; i++) {
            if (s.charAt(i) != '0') break;
        }

        return (i > j) ? "" : s.substring(i, j + 1);
    }

    public static void main(String[] args) {
        LargestOddNumberFinder finder = new LargestOddNumberFinder();

        String input1 = "52034013";
        String input2 = "4208000";
        String input3 = "00013500";
        String input4 = "86420";

        System.out.println("Input: " + input1 + " → Output: " + finder.largeOddNum(input1));
        System.out.println("Input: " + input2 + " → Output: " + finder.largeOddNum(input2));
        System.out.println("Input: " + input3 + " → Output: " + finder.largeOddNum(input3));
        System.out.println("Input: " + input4 + " → Output: " + finder.largeOddNum(input4));
    }
}


