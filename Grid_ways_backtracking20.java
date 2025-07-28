public class Grid_ways_backtracking20 {

    public static int grid_ways(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        if (i >= n || j >= m) {
            return 0;
        }

        int W1 = grid_ways(i + 1, j, n, m); // Move down
        int W2 = grid_ways(i, j + 1, n, m); // Move right
        return W1 + W2;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println("Number of ways to reach the destination: " + grid_ways(0, 0, n, m));
    }   
}
