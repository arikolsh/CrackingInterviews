package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.ArrayList;

public class MinimalChange {
    //Minimal Number of Coins for Change
    ArrayList<Integer> getMinimalChange(int amount, int[] coins) {
        assert (coins[0] == 1);
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(amount == 0) return res;
        int[] M = new int[amount + 1];
        int[] C = new int[amount + 1];
        M[0] = 0;
        C[1] = 1;
        for (int i = 2; i <= amount; i++) {
            M[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int index = i - coins[j];
                if (index >= 0 && M[i] >= M[index] + 1) {
                    M[i] = M[index] + 1;
                    C[i] = coins[j]; //coin used
                }
            }
        }

        int currAmount = amount;
        while (currAmount > 0) {
            res.add(C[currAmount]);
            currAmount -= C[currAmount];
        }

        return res;
    }

    @Test
    public void t() {
        System.out.println(getMinimalChange(5, new int[]{1, 5, 10, 20}));
        char b= 'd';
        int a = 'd' - 'a';
        System.out.println(a);

    }
}

