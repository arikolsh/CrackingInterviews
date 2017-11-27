package problemsolving.ibit;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/28/2017.
 */
public class BinaryClosestFindTest {

    @Test
    public void solve(){
        int res = new BinaryClosestFind().solve(7, Arrays.asList(-4,-2,3,8,9,10,13,20,111));
        assertEquals(8,res);
    }
}
