package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/28/2017.
 */
public class IntersectionTest {

    @Test
    public void solveTest(){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 3, 5));
        ArrayList<Integer> res = new Intersection().solve(a, b);
        assertEquals(res, Arrays.asList(3, 3, 5));
    }

}
