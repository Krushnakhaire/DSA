import java.util.*;
public class find_Peak_element {
    public int find_Peak_element(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;

            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
    


    public static void main(String[] args) {
        find_Peak_element obj = new find_Peak_element();
        int arr[] = {1, 3, 20, 4, 1, 0};
        int peak = obj.find_Peak_element(arr);
        System.out.println("The peak element is: " + peak);
    }
}

