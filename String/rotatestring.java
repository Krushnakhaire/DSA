public class rotatestring {
   
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String combined = s + s;
        return combined.contains(goal);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "abcde";
        String goal1 = "cdeab";

        String s2 = "abcde";
        String goal2 = "abced";

        System.out.println("Test 1: " + sol.rotateString(s1, goal1)); 
        System.out.println("Test 2: " + sol.rotateString(s2, goal2));  
    }
}

    

