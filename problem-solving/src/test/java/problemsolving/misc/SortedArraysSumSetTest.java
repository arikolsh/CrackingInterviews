package problemsolving.misc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 11/27/2017.
 */
public class SortedArraysSumSetTest {
    @Test
    public void test() {
        List<Integer> arr1 = Arrays.asList(1,3, 4, 8, 10);
        List<Integer> arr2 = Arrays.asList(20, 22, 30, 40);
        int a = new SortedArraysSumSet().solve(arr1, arr2,  4);
        assertEquals(25, a);
    }
}
