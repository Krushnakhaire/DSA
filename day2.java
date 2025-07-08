public class day2 {
  
// Product of array elements:  
    public void productarr(int arr[]){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        System.out.println("Product of the array elements is: " + product);

    }



//even elements:
    public void evenelements(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("element is even"+ arr[i]);
            }else{
                System.out.println("element is odd"+ arr[i]);
            }
        }

    }



    //prime number:
    public void primeelements(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("element is prime"+ arr[i]);
            }else{
                System.out.println("element is not prime"+ arr[i]);
            }
        }

    }
    


//count of positive & negative number:
     public void countposneg(int arr[]){
        int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("count of positive number is: " + pos);
        System.out.println("count of negative number is: " + neg);}
    public  static void main(String args[]){
      int arr[]={2,2,4,4,6,3};
    //   product p=new product();
    //   p.productarr(arr);



        // product p1=new product();
        // p1.evenelements(arr);



        // product p1=new product();
        // p1.primeelements(arr);


        // day2 p1=new day2();
        // p1.primeelements(arr);


        day2 p1=new day2();
        p1.countposneg(arr);;


    }    
}

