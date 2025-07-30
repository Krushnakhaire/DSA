import java.util.Scanner;
public class missing_num_23 {
    
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){

            if(nums[i]<0 || nums[i]>nums.length-1){
                System.out.println("Invalid input: " + nums[i]);
                return -1; // or throw an exception
            }

            if(nums[i] == nums.length-1){
                System.out.println("The missing number is: " + (nums.length-1));
                return nums.length-1;
            }

            if(nums[i] == 0){
                System.out.println("The missing number is: 0");
                return 0;
            }

            if(nums[i] == nums.length-2){
                System.out.println("The missing number is: " + (nums.length-2));
                return nums.length-2;
            }


            
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n[]=sc.nextInt();
        System.out.println("enter an element in nums");
        for(int i=0;i<nums.length();i++){
            nums[i]=sc.nextInt();
        }

        missing_num_23 s1=new missing_num_23();
        s1.missingNumber(nums);
            }
}
    

