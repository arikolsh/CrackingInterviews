package problemsolving.euler;

import java.util.ArrayList;

/**
 * Created by ariko on 10/17/2017.
 */
public class LargestPalidromeProduct {

    public long findLargestPalidromeProduct() {
        long currProduct;
        long x = 999;
        long y = 999;
        // check y=999 times x=999,998,997 ... 100
        // until x=100 then decrement y, y=998 and multiply with x=998,997...100
        do {
            currProduct = x * y;
            if (x > 100) {
                x--;
            } else {
                y--;
                x = y;
                if (y <= 100) {
                    return -1; // no palindrome found
                }
            }
        } while (!isPalidrome(currProduct));
        return currProduct;
    }

    public boolean isPalidrome(long num) {
        ArrayList<Integer> digits = getDigitsArray(num);
        for (int i = 0; i < digits.size() / 2; i++) {
            Integer left = digits.get(i);
            Integer right = digits.get(digits.size() - i - 1);
            if (!left.equals(right)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getDigitsArray(long num) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add((int) (num % 10));
            num /= 10;
        }
        return digits;
    }

}
