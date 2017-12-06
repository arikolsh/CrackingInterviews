package problemsolving.misc;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ariko on 11/27/2017.
 */
public class ReverseWordInPlaceTest {

    @Test
    public void solve(){
        char[] word1 = {'h','e','l','l','o'};
        char[] word2 = {'m','a','n'};
        new ReverseWordInPlace().solve(Arrays.asList(word1,word2));
    }

}
