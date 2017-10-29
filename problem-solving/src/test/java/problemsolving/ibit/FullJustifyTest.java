package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class FullJustifyTest {
    @Test
    public void solve() {

        int L = 16;
        int L2 = 10;
        ArrayList<String> a = new ArrayList<>(Arrays.asList("This", "is", "an", "example", "of", "text", "justification."));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(""));
        ArrayList<String> res = new FullJustify().solve(a, L);
        ArrayList<String> res2 = new FullJustify().solve(b, L2);
        assertEquals("", new ArrayList<String>(Arrays.asList("This    is    an", "example  of text", "justification.  ")), res);
        assertEquals("", new ArrayList<String>(Arrays.asList("          ")), res2);
    }


}
