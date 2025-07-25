public class day5 {
    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }





  //  Reverse Recursion:
 
    public static void reverse(int[] arr, int i, int j) {
        if (i >= j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i + 1, j - 1);
    }

    

    //Palindrome check:
public class Main {

    public static void palindrome(int i, String str) {
        if (i >= str.length() / 2) {
            System.out.println("Is a Palindrome");
            return;
        }

        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            System.out.println("Not a Palindrome");
            return;
        }

        palindrome(i + 1, str);
    }



    public static void main(String args []){
        day5 d5 = new day5();
        // int n = 5;
        // int result = d5.factorial(n);
        // System.out.println("Factorial of " + n + " is: " + result);




        //  int[] arr = {1, 2, 3, 4, 5};
        //  reverse(arr, 0, arr.length - 1);
        //  for (int num : arr) {
        //  System.out.print(num + " ");




        
         String str1 = "madam";
        palindrome(0, str1); 

        String str2 = "hello";
        palindrome(0, str2);  
    }
}

        }
    
    

