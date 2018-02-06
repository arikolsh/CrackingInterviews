package problemsolving.glassdoor;

import org.junit.Test;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.swap;

public class LargestNumFromSameDigits {

    @Test
    public void t() {
        int n2 = 321;
        System.out.println(
                n2
        );
        System.out.println();
        System.out.println(solve(n2));
        System.out.println(solveV3(n2));

    }

    public int solveV3(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int tmp = n;
        while (tmp > 0) {
            digits.add(tmp % 10);
            tmp /= 10;
        }
        if (isSorted(digits)) return -1;
        int pivot = 0;
        for (int i = 1; i < digits.size(); i++) {
            if (digits.get(i) > digits.get(i - 1)) {
                pivot = i;
                swap(digits, i, i - 1);
                break;
            }
        }
        int closest = Integer.MAX_VALUE;
        int closestIndex = pivot;
        for (int i = 0; i < pivot-1; i++) {
            if (digits.get(i) > digits.get(pivot) && digits.get(i) < closest) {
                closest = digits.get(i);
                closestIndex = i;
            }
        }
        swap(digits, closestIndex, pivot);
        Collections.sort(digits.subList(0, pivot));
        return toNum(digits);
    }

    private boolean isSorted(ArrayList<Integer> digits) {
        return false;
    }


    public int solveV2(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        int[] digCount = new int[10];
        int tmp = n;
        while (tmp > 0) {
            digits.add(tmp % 10);
            digCount[tmp % 10]++;
            tmp /= 10;
        }
        Collections.sort(digits);
        Collections.reverse(digits);
        int low = toNum(digits);
        for (int i = n - 1; i >= low; i--) {
            if (sameDigits(i, digCount)) return i;
        }
        return -1;
    }

    private boolean sameDigits(int num, final int[] digitCount) {
        int[] tmp = new int[10];
        while (num > 0) {
            tmp[num % 10]++;
            num /= 10;
        }
        return Arrays.equals(digitCount, tmp);
    }

    public int solve(int n) {
        ArrayList<Integer> perms = getPerms(n);
        Collections.sort(perms);
        int i = perms.indexOf(n);
        if (i <= 0) return -1;
        else return perms.get(i - 1);
    }

    public ArrayList<Integer> getPerms(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        ArrayList<ArrayList<Integer>> perms = generatePerms(digits, 0);
        ArrayList<Integer> res = new ArrayList<>();
        for (ArrayList<Integer> perm : perms) {
            res.add(toNum(perm));
        }
        return res;
    }

    public ArrayList<ArrayList<Integer>> generatePerms(ArrayList<Integer> arr, int s) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (s >= arr.size()) {
            res.add(new ArrayList<>());
            return res;
        }
        Integer curr = arr.get(s);
        for (ArrayList<Integer> perm : generatePerms(arr, s + 1)) {
            for (int i = 0; i <= perm.size(); i++) {
                ArrayList<Integer> tmp = new ArrayList<>(perm);
                tmp.add(i, curr);
                res.add(tmp);
            }
        }
        return res;
    }


    public int toNum(ArrayList<Integer> digits) {
        int res = 0;
        int factor = 1;
        for (Integer digit : digits) {
            res += digit * factor;
            factor *= 10;
        }
        return res;
    }

}
