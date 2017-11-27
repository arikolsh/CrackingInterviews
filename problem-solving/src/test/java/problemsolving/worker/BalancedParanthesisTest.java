package problemsolving.worker;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.springframework.test.util.AssertionErrors.assertTrue;

public class BalancedParanthesisTest {

    @Test
    public void test(){
        String s1 = "(())";
        String s2 = "((q)qwr(r))";
        String bads = "(()";
        assertTrue("",new BalancedParanthesis().isValid(s1));
        assertTrue("",new BalancedParanthesis().isValid(s2));
        assertFalse("",new BalancedParanthesis().isValid(bads));

    }

}
