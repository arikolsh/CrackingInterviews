package problemsolving.worker;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;

public class MatrixStream {

    int size;
    int pushCount = -1;
    int[] arr;

    public MatrixStream(int s) {
        size = s;
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) arr[i] = 0;
    }

    public Boolean push(int x) {
        pushCount = (pushCount + 1) % size;
        if (x > 0) {
            arr[pushCount] = size;
        } else {
            if (arr[pushCount] > 0) {
                arr[pushCount]--;
            } else {
                arr[pushCount] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) return false;
        }
        if (pushCount == 2) return true;
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(first != arr[i]) return false;
        }
        return true;
    }

}
