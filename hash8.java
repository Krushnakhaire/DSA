public class hash8 {
    public void hashingarr(int arr[], int[] hash) {
             for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " -> " + hash[i]);
            }
        }
    }



//hasshing character:
       public void  hasshingchar(char str[],int [] hash){
        for(int i=0;i<str.length;i++){
            char ch=str[i];
            int index=(int)ch;
            hash[index]++;

        }

       }  
       
       
    public static void main(String[] args) {

//hash array:        
        // int[] arr = {1, 2, 2, 3, 1, 4, 2};
        // int[] hash = new int[100];
        // hash8 h8 = new hash8();
        // h8.hashingarr(arr, hash);


//hash character:
          char [] str={'a', 'b', 'c', 'a', 'b', 'd'};   
          int[] hash = new int[256]; 
          hash8 h8 = new hash8(); 
          h8.hasshingchar(str, hash);
   
    }
}




