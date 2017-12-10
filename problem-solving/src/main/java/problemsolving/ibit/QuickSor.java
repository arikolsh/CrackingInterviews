package problemsolving.ibit;

import java.util.Arrays;

/**
 * Created by ariko on 10/29/2017.
 */
public class QuickSor {

    public void solve(int[] a) {
        if (a == null || a.length == 0) return;
        sortUtil(a, 0, a.length - 1);
    }

    private void sortUtil(int[] a, int l, int r) {
        int i = l;
        int j = r;
        int pivot = a[l + (r - l) / 2];
        while (i <= j) {
            while (a[i] < pivot) { //advance until find someone we can swap
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        if (l < j)
            sortUtil(a, l, j);
        if (i < r)
            sortUtil(a, i, r);

    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
