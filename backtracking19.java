import java.util.Scanner;
import java.util.Arrays;
public class backtracking19 {
    public void backtracking(int arr[],int i,int val){
        if(i==arr.length){
            return;
        }
       
         arr[i] = val;
         backtracking(arr,i+1,val+1);                   //Recursion
         arr[i]=arr[i]-2;                               //backtraccking
        }
    public void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n[]=new int [sc.nextInt()];
        System.out.println("enter the elements of array");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }

        backtracking19 b=new backtracking19();
        b.backtracking(n, 0,1);
        System.out.println("The array after backtracking is: " + Arrays.toString(n));


    }
    
}

