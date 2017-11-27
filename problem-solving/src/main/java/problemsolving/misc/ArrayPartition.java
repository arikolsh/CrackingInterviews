package problemsolving.misc;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Created by ariko on 11/23/2017.
 */
public class ArrayPartition {

    public void partitionWithPredicate(int[] a, int start, Predicate<Integer> belongsLeft) {
        int[] res = new int[a.length];
        int left = start, right = a.length - 1;
        for (int i = start; i < a.length; i++) {
            if (belongsLeft.test(a[i])) {
                res[left++] = a[i];
            } else {
                res[right--] = a[i];
            }
        }
        for (int i = start; i < a.length; i++) {
            //copy
            a[i] = res[i];
        }
    }

    public void partitionWithPredicateInPlace(int[] a, int start, Predicate<Integer> belongsLeft) {
        int runner = start;
        for (int i = start; i < a.length; i++) {
            if (!belongsLeft.test(a[i])) {
                if (runner < i) {
                    runner = i;
                }
                while (runner < a.length && !belongsLeft.test(a[runner])) {
                    runner++;
                }
                if (runner >= a.length) {
                    return;
                }
                swap(a, runner, i);
            }
        }
    }

    private void swap(int[] a, int runner, int i) {
        int tmp = a[i];
        a[i] = a[runner];
        a[runner] = tmp;
    }

    public void solve0and1(int[] a) {
        Predicate<Integer> isZero = x -> x == 0;
        partitionWithPredicateInPlace(a, 0, isZero);
    }

    public void solve0and1and2(int[] a) {
        Predicate<Integer> isZero = x -> x == 0;
        partitionWithPredicateInPlace(a, 0, isZero);
        Predicate<Integer> isOne = x -> x == 1;
        int start = 0;
        while (start < a.length && a[start] == 0) {
            start++;
        }
        partitionWithPredicateInPlace(a, start, isOne);
    }


}
