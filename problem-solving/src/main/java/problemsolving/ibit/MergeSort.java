package problemsolving.ibit;

import java.util.Arrays;

/**
 * Created by ariko on 10/29/2017.
 */
public class MergeSort {
    public int[] solve(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length <= 1) {
            return a;
        }
        int n = a.length;
        int[] left = solve(Arrays.copyOfRange(a, 0, n / 2));
        int[] right = solve(Arrays.copyOfRange(a, n / 2, n ));
        return merge(left, right);
    }

    public int[] merge(int[] a, int[] b) {
        if (a == null && b == null) return null;
        if (a == null) return b;
        if (b == null) return a;
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, k = 0;
        int[] res = new int[n + m];
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) res[k++] = a[i++];
        while (j < m) res[k++] = b[j++];
        return res;
    }
}
