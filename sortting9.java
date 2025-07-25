public class sortting9 {
    //Selection sort:
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

//Bubble Sort:
    public void bubblesort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[]={20,27,8,69,34};
        sortting9 s9 = new sortting9();
        //s9.selectionsort(arr, arr.length);
        s9.bubblesort(arr, arr.length);

        
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }
    
}
