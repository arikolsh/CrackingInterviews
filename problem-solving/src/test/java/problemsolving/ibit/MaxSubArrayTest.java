package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 10/20/2017.
 */
public class MaxSubArrayTest { //working solution

    @Test
    public void maxSetTest() {

        ArrayList<Integer> result = new MaxSubArray().maxset(
                new ArrayList<Integer>(Arrays.asList(0, 0, -1, 0))
        );

        assertEquals(Arrays.asList(0, 0),result);

       result = new MaxSubArray().maxset(
                new ArrayList<Integer>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368 ))
        );

        assertEquals(Arrays.asList(1967513926, 1540383426 ),result);

    }


}





