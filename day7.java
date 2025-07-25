import java.util.Scanner;
//count number
public class day7 {
    public static int countDigit(int n) {
        int count = 0;
        if (n == 0) return 1;

        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        int result = countDigit(n);
        System.out.println("Total digits: " + result);
    }
}