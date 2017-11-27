package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class LCSTest {
    @Test
    public void longestCommonPrefixTest() {
        ArrayList<String> lst = new ArrayList<>(Arrays.asList(
                "abcd","abcd","efgh"
        ));
        String res = new LCS().longestCommonPrefix(lst);
        Map m = new HashMap<String,Integer>();
        String expected = "";
        //assertEquals("",expected, res);
    }



}
