package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRowColToZero {

    public void solve(int[][] mat) {
        if (mat == null || mat[0] == null) return;
        Set<Integer> colsZeroesIndices = new HashSet<>();
        Set<Integer> rowsZerosIndices = new HashSet<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    rowsZerosIndices.add(i);
                    colsZeroesIndices.add(j);
                }
            }
        }

        for (Integer row : rowsZerosIndices) {
            clearRow(mat, row);
        }
        for (Integer col : colsZeroesIndices) {
            clearCol(mat, col);
        }

    }

    private void clearRow(int[][] mat, Integer row) {
        //clear row
        for (int c = 0; c < mat[0].length; c++) {
            mat[row][c] = 0;
        }
    }

    private void clearCol(int[][] mat, int j) {
        //clear col
        for (int r = 0; r < mat.length; r++) {
            mat[r][j] = 0;
        }

    }

    @Test
    public void t() {
        int[][] mat = {{1, 0, 3}, {0, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}, {0, 2, 0}};
        int[][] mat3 = {{0, 2, 3}, {0, 5, 6}, {6, 2, 9}};
        printMat(mat);
        System.out.println("=>");
        solve(mat);
        printMat(mat);
        System.out.println("----------");
        printMat(mat2);
        System.out.println("=>");
        solve(mat2);
        printMat(mat2);
        System.out.println("----------");
        printMat(mat3);
        System.out.println("=>");
        solve(mat3);
        printMat(mat3);
    }


    private void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }


}
