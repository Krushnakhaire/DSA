public class day3 {

    public void mergearrays(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2]; 

        for (int i = 0; i < arr3.length; i++) {
            if (i < n1) {
                arr3[i] = arr1[i];
            } else {
                arr3[i] = arr2[i - n1];
            }
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }




    //factors of number  in array:

public void factor(int n){
    int arr[] = new int[n];
    int j = 0;
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            arr[j] = i;
            j++;
        }

    }
    System.out.println("Factors of " + n + ":");
    for(int i = 0; i < j; i++){
        System.out.print(arr[i] + " ");
    }
}
    public static void main(String args[]) {
        day3 d3 = new day3();
        //d3.mergearrays(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8, 9, 10});

        d3.factor(12);
    }
}
