package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.Arrays;

public class RotateMatrix {

    public int[][] solve(int[][] mat) {

        int[][] res = new int[mat.length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                res[j][mat.length - 1 - i] = mat[i][j];
            }
        }
        return res;

    }

    @Test
    public void t() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMat(mat);
        System.out.println();
        printMat(solve(mat));
    }

    private void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }


}
