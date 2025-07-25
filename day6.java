public class day6 {
    //Fabonacci Recursion
    public void  FabonacciRecursion(int i,int n){
        if(n<=1){
            return;
        }
        int last=n-1;
        int secondlast=n-2;
        int result=last+secondlast;
        System.out.println(result);
    }
    public static void main(String args[]){
        int n=5;
        day6 d6 = new day6();
        d6.FabonacciRecursion(0, n);
        
    }
    
}
