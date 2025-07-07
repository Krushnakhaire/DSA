// public class Qspider {
   // public void printarr(int arr[]){
//         // for(int i=0;i<arr.length;i++)

// //using while loop
//            int i=0;

// // do while loop
//     //       do{
//     // System.out.println(arr[i]);
//     //         i++;
//     //        }
//     // while(i<arr.length);
//     //     // System.out.println(arr[i]);
//     //     // i++;


    
//     }
 



// //2D array:
// public class Qspider {
// public void printarr(int arr[][][]){
//     for (int i=0;i<arr.length;i++){
//         for(int j=0;j<arr[i].length;j++){
//             for (int k=0;k<arr[i][j].length;k++){
//                 System.out.print(arr[i][j][k] + " ");
//             }
//         }
//         System.out.println();
//     }

// }


// //using while loop
// // public class Qspider{
// //     public void printarr(int arr[][]){
// //    int i=0;
// //    while(i<2){
// //     int j=0;
// //     while(j<2){
// //         System.out.println(arr[i][j]);
// //         j++;
// //     }
// //     System.out.println();
// //    }
// //     }

// public static void main(String args[]){
//     int arr[][][]={    { {1, 2}, {3, 4} },
//             { {5, 6}, {7, 8} },
//             { {9, 10}, {11, 12} }
//         };
//     Qspider q=new Qspider();
//     q.printarr(arr);

// }
// }





public  class Qspider{
    public static void sum(int arr[]){
        int sum=0;
        for (int i=0;i<10;i++){
            System.out.println(arr[i]);
            sum=sum+arr[i];
            System.out.println("Sum is: " + sum);
        }
        System.out.println("Sum is: " + sum);

    }
    public static void main(String args[]){
         int arr[]={1,1,2,2,3,3,4,4,5,5};
        Qspider q=new Qspider();
        q.sum(arr);


    }
}