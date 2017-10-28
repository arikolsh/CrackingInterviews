package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/28/2017.
 */
public class removeDupTest {
    @Test
    public void solve() {

        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(5000, 5000, 5000));
        int res = new removeDup().solve(a);
        assertEquals(1,res);

    }
}
