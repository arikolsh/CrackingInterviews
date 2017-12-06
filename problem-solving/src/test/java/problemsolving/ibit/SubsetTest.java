package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by ariko on 12/6/2017.
 */
public class SubsetTest {

    @Test
    public void t() {
        ArrayList<Integer> integers = new ArrayList<>(asList(12, 13));
        ArrayList<ArrayList<Integer>> res = new Subset().subsets(integers);
        System.out.println(res);
    }


}
