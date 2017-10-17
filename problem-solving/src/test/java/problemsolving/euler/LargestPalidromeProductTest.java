package problemsolving.euler;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/17/2017.
 */
public class LargestPalidromeProductTest {

    @Test
    public void findLargestPalidromeProduct() {
        LargestPalidromeProduct c = new LargestPalidromeProduct();
        long res = c.findLargestPalidromeProduct();
        assertEquals(9009,res);
    }

}
