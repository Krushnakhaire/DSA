import java.util.ArrayList;

public class find_minimum_in_Array {
  
    public int findMin(ArrayList<Integer> arr) {
      int low=0;
      int high=arr.size()-1;
      while(low<high){
      int mid=(low+high)/2;
      if(arr.get(mid)>arr.get(high)){
        low=mid+1;
      }
      else{
        mid=high;
      }
    }
    return arr.get(low);
    }

}



