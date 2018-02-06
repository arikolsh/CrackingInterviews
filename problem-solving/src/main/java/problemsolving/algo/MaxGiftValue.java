package problemsolving.algo;

import org.junit.Test;

import java.util.*;

public class MaxGiftValue {

    private static final char DOWN = 0;
    private static final char RIGHT = 1;

    //Maximal Value of Gifts
    public List<String> getMaxGiftPath(int[][] gift) {
        LinkedList<String> path = new LinkedList<>();
        char[][] dirMat = new char[gift.length][gift[0].length];
        int[][] M = new int[gift.length][gift[0].length];
        //base cases
        M[0][0] = gift[0][0];
        for (int i = 1; i < gift.length; i++) {
            M[i][0] = M[i - 1][0] + gift[i][0];
            dirMat[i][0] = DOWN;
        }
        for (int i = 1; i < gift[0].length; i++) {
            M[0][i] = M[0][i - 1] + gift[0][i];
            dirMat[0][i] = RIGHT;
        }
        //step
        for (int i = 1; i < gift.length; i++) {
            for (int j = 1; j < gift[0].length; j++) {
                if (M[i - 1][j] > M[i][j - 1]) {
                    M[i][j] = M[i - 1][j];
                    dirMat[i][j] = DOWN;
                } else {
                    M[i][j] = M[i][j - 1];
                    dirMat[i][j] = RIGHT;
                }
                M[i][j] += gift[i][j];
            }
        }
        int row = gift.length - 1;
        int col = gift[0].length - 1;
        while (row != 0 || col != 0 && row > -1 && col > -1) {
            if (dirMat[row][col] == DOWN) {
                path.addFirst("down");
                row--;
            } else {
                path.addFirst("right");
                col--;
            }
        }
        System.out.println("max value if: " + M[M.length - 1][M[0].length - 1]);
        return path;
    }

    @Test
    public void t() {
        int[][] gift = {{0, 2, 3}, {2, 5, 6}, {1, 8, 9}};
        printMat(gift);

        System.out.println(getMaxGiftPath(gift));

        gift = new int[][]{{1, 10, 3, 8}, {12, 2, 9, 6}, {5, 7, 4, 11}, {3, 7, 16, 5}};
        printMat(gift);
        PriorityQueue<MyContainer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x.getLastPosition()));
        HashMap<Integer, MyContainer> map = new HashMap<>();
        System.out.println(getMaxGiftPath(gift));
    }

    private void printMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        Map<Character, Integer> map = new HashMap<>();
        Integer min = Integer.MAX_VALUE;
        Character charToRemove;
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
        }
    }

}
