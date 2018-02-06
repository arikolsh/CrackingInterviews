package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public void rotate(int[][] a) {

        int n = a.length - 1;
        int layers = a.length / 2;

        for (int i = 0; i < layers; i++) {
            for (int j = i; j < n - i; ++j) {

                int temp1 = a[n - j][i];
                int temp2 = a[n - i][n - j];
                int temp3 = a[j][n - i];
                int temp4 = a[i][j];
                //shift upwards with temps
                // swap
                a[i][j] = temp1;
                a[n - j][i] = temp2;
                a[n - i][n - j] = temp3;
                a[j][n - i] = temp4;
            }
        }
    }

    @Test
    public void t() {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMat(mat);
        System.out.println();
        rotate(mat);
        printMat(mat);


    }

    private void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}


