public class sortting9 {
    public void selectionsort(int arr[],int n){
        int min;
        for(int i=0;i<=n-2;i++){
            min=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }

    public static void main(String args[]){
        int arr[]={20,27,8,69,34};
        sortting9 s9 = new sortting9();
        s9.selectionsort(arr, arr.length);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
    
}
