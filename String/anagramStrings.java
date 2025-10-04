    import java.util.Arrays;

class Solution {
    public boolean anagramStrings(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "anagram";
        String t = "nagaram";

        System.out.println("Is Anagram? " + sol.anagramStrings(s, t));
    }
}

    

