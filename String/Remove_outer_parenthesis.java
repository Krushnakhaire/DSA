class Remove_Outer_parenthesis {
    
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  

            if (c == '(') {
                if (depth > 0) {
                    ans.append(c);
                }
                depth++;
            } else { // c == ')'
                depth--;
                if (depth > 0) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Remove_Outer_parenthesis obj = new Remove_Outer_parenthesis();
        String input = "(()())(())";
        String result = obj.removeOuterParentheses(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result); 
    }
}

    

