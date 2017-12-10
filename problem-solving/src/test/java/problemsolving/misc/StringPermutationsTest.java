package problemsolving.misc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Created by ariko on 11/26/2017.
 */
public class StringPermutationsTest {

    @Test
    public void solve() {

        String s = "WORD";
        Set<String> expected = new HashSet<>(Arrays.asList(
                "WORD",
                "WODR",
                "WROD",
                "WRDO",
                "WDOR",
                "WDRO",
                "OWDR",
                "OWRD",
                "ORDW",
                "ORWD",
                "ODRW",
                "ODWR",
                "RWOD",
                "RWDO",
                "ROWD",
                "RODW",
                "RDWO",
                "RDOW",
                "DWRO",
                "DWOR",
                "DORW",
                "DOWR",
                "DROW",
                "DRWO"));
        ArrayList<String> res = new StringPermutations().solve(s);
        assertEquals(expected, new HashSet<>(res));
    }

}
