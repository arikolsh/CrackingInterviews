package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/28/2017.
 */
public class ThreeSumTest {
    @Test
    public void solve() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 1, 6, 10, -4, 1, -3, -10, -7, 10, -2, -5, 1, 7, -1, 7, -9, -7, 5, -2, 7, -1, -1, 10, 6, 0, -2, 9, 5, -9, 4, 8, 3, -6, -7, 0, 9, 3, 0, -10, 3, 7, -9, 10, -4, 7, 2, 1, -9, 3, 10, 4, 0, -2, -5, -4, 9, 10, 8, 7, 2, 1, 0, 3, 4, 7, 4, -3, 0, 8, -1 ));
        int res = new ThreeSum().solve(a, -1);
        assertEquals("",-1,res);
    }
}
