public class Buy_Stock_Sell {

    public int stockBuySell(int[] arr, int n) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            int profit = arr[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
         stockBuySell s1 = new stockBuySell();
        int[] arr1 = {10, 7, 5, 8, 11, 9};
        int[] arr2 = {5, 4, 3, 2, 1};

        System.out.println(s1.stockBuySell(arr1, arr1.length)); 
        System.out.println(s1.stockBuySell(arr2, arr2.length)); 
    }
}

    

