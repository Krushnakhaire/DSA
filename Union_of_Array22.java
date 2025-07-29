import java.util.Scanner;

public class Union_of_Array22 {
    public void Union_of_Array22(int arr1[],int arr2[],int n,int m ){
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.println(arr2[j]);
                j++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }


        }
        while(i<n){
            System.out.println(arr1[i]);
            i++;
        }
        while(j<m){
            System.out.println(arr2[j]);
            j++;
        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of first array");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter elements of first array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Size of second array");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("enter element of 2nd array");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();

        }
        Union_of_Array22 obj = new Union_of_Array22();
        System.out.println("Union of two arrays is:");
        obj.Union_of_Array22(arr1, arr2, n, m);

    }
    
}
