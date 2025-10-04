import java.util.Scanner;

public class Isomorphicstring {
    
    public static boolean isomorphicString(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapST[cs] == 0 && mapTS[ct] == 0) {
                mapST[cs] = ct;
                mapTS[ct] = cs;
            } else {
                if (mapST[cs] != ct || mapTS[ct] != cs) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = isomorphicString(s, t);

        if (result) {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are isomorphic.");
        } else {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are NOT isomorphic.");
        }

        sc.close();
    }
}
