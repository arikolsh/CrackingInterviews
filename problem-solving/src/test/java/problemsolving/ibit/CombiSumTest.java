package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by ariko on 12/6/2017.
 */
public class CombiSumTest {

    @Test
    public void t() {

        ArrayList<Integer> a = new ArrayList<>(asList(10, 1, 2, 7, 6, 1, 5));
        int t = 8;
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(asList(1, 7)));
        expected.add(new ArrayList<>(asList(1, 2, 5)));
        expected.add(new ArrayList<>(asList(2, 6)));
        expected.add(new ArrayList<>(asList(1, 1, 6)));

        a = new ArrayList<>(asList(8, 10, 6, 11, 1, 16, 8));
        t = 8;
        expected = new ArrayList<>();
        expected.add(new ArrayList<>(asList(1, 6, 10, 11)));
        expected.add(new ArrayList<>(asList(1, 8, 8, 10)));
        expected.add(new ArrayList<>(asList(1, 11, 16)));
        t = 28;
        System.out.println("expected: " + expected);
        ArrayList<ArrayList<Integer>> res = new CombiSum().combinationSum(a, t);
        System.out.println("actual: " + res);

    }

}
