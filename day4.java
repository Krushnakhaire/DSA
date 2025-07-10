public class day4 {
// Recursion in Java  
    public void Recursion(int i,int n){
        if(i>n){
            return;
        }
        
        System.out.println(i);
        Recursion(i+1,n);
    }




// Reverse Recursion
    public void ReverseRecursion(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        ReverseRecursion(i-1, n);
    }


//recursion from 1 to N

public void Recursion1toN(int i,int n){
        if(i<1){
            return;
        }
        Recursion1toN(i-1,n);
        System.out.println(i);
    }



    public void RecursionNto1(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        RecursionNto1(i-1,n);
    }
    public static void main(String args[]){
        int n=5;
        day4 d4 = new day4();
        //d4.Recursion(0,n);


        //d4.ReverseRecursion(n, n);


        //d4.Recursion1toN(n, n);


        d4.RecursionNto1(n, n);
    }
    
}
