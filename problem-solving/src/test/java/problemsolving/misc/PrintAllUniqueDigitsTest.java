package problemsolving.misc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 12/2/2017.
 */
public class PrintAllUniqueDigitsTest {

    @Test
    public void t(){
        List<Integer> expected = asList(10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30);
        List<Integer> lst = new PrintAllUniqueDigits().solve(10,30);
        assertEquals(expected,lst);
        List<Integer> solve = new PrintAllUniqueDigits().solve(100, 500);
        System.out.println(solve);
    }

}
