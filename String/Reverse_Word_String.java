public class Reverse_Word_String {
    
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+"); 
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
         public static void main(String[] args) {
        Reverse_Word_String sol = new Reverse_Word_String();
        
        System.out.println(sol.reverseWords("welcome to the jungle"));
        
        
        System.out.println(sol.reverseWords(" amazing   coding skills "));
    }
        }
    

    

