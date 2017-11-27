package problemsolving.ibit;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/29/2017.
 */
public class MergeSortTest {
    @Test
    public void solveTest(){
        int[] a= {9,8,4,2,8,1,3,0,1,3,8};
        int[] res = new MergeSort().solve(a);
        int[] b={1,6,10};
        int[] c={4,20};
        assertEquals(Arrays.toString(new int[]{1,4,6,10,20}),Arrays.toString(new MergeSort().merge(b,c)));
        assertEquals(Arrays.toString(new int[]{0, 1, 1, 2, 3, 3, 4, 8, 8, 8, 9}),Arrays.toString(res));
    }

}
