package problemsolving.ibit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindPivot {
    public int findPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int pivot = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid > 0 && arr[mid + 1] < arr[mid]) {
                pivot = mid + 1;
                break;
            }
            if (arr[mid] > arr[left]) {
                //array in {start...mid} is sorted
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return pivot;
    }

    @Test
    public void t() {
        System.out.println(findPivot(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findPivot(new int[]{10, 1, 3, 4, 5, 6}));


    }
}
