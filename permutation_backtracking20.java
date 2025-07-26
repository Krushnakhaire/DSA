
import java.util.Scanner;
public class permutation_backtracking20{
    public void permutationbacktracking(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //abcde=ab+de
            String newstr=str.substring(0, i) + str.substring(i + 1);
            permutationbacktracking(newstr, ans + curr);
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.next();
        System.out.println("All permutations:");
        permutation_backtracking20 p = new permutation_backtracking20();
        p.permutationbacktracking(str, "");


    }
    
}
