import java.util.*;
public class kth _missing_value {
  
   
        int n = arr.length;
        int l = 0, r = n - 1, idx = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int missing = arr[m] - (m + 1);
            if (missing >= k) {
                idx = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (idx == n) {
            int missingLast = arr[n - 1] - n;
            return arr[n - 1] + (k - missingLast);
        }
        if (idx == 0) return k;
        int missingBefore = arr[idx - 1] - idx;
        return arr[idx - 1] + (k - missingBefore);
    }


    

