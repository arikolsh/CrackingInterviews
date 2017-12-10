package problemsolving.worker;

import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class StringOrderSortTest {
    @Test
    public void test(){
        assertEquals("","dbbccaaee",new StringOrderSort().sort("dfbcae","abcdeeabc"));
    }
}
