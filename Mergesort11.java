public class Mergesort11 {
    
    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[left + x] = temp[x];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3, 7};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }
}

    

