public class CompareString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals: " + areEqual);

        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Using equalsIgnoreCase: " + areEqualIgnoreCase);

        int comparisonResult = str1.compareTo(str2);
        System.out.println("Using compareTo: " + comparisonResult);
    }

    
}
