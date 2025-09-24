public class CountOccurance {

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 1, 1, 2, 3};
        int target1 = 1;
        System.out.println("Occurrences of " + target1 + ": " + countOccurrences(arr1, target1));

        int[] arr2 = {5, 5, 5, 5, 5, 5};
        int target2 = 5;
        System.out.println("Occurrences of " + target2 + ": " + countOccurrences(arr2, target2));
    }
}
