package problemsolving.ibit;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/29/2017.
 */
public class QuickSorTest {
    @Test
    public void solveTest(){
        int[] a= {9,8,4,2,8,1,3,0,1,3,8};
        new QuickSor().solve(a);
        System.out.println(Arrays.toString(a));
        assertEquals(Arrays.toString(new int[]{0, 1, 1, 2, 3, 3, 4, 8, 8, 8, 9}),Arrays.toString(a));
    }

}
