public class day5 {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args []){
        day5 d5 = new day5();
        int n = 5;
        int result = d5.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
    
}
