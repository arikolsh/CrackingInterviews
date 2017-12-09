package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ariko on 12/8/2017.
 */
public class SetCoinsSumTest {

    @Test
    public void t() {

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3,4,5,6,7));
        SetCoinsSum oo = new SetCoinsSum();
        int i = oo.coinchange2(a, 10);
        System.out.println("actual: " + i);
        //System.out.println("method count: " + oo.methodCount);

    }


}
