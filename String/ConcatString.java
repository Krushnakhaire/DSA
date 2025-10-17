public class ConcatString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenating strings using + operator
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated using +: " + concatenated);

        // Concatenating strings using concat() method
        String concatenatedUsingMethod = str1.concat(" ").concat(str2);
        System.out.println("Concatenated using concat(): " + concatenatedUsingMethod);
    }
    
    
}
