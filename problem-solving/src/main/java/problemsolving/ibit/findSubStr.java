package problemsolving.ibit;

import org.junit.Test;

public class findSubStr {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if (A == null || A.isEmpty()) return -1;
        if (B == null || B.isEmpty()) return -1;
        if (A.length() < B.length()) return -1;
        //sliding window
        int start = 0;
        int end = B.length();
        while (end < A.length()) {
            int i;
            for (i = 0; i < B.length(); i++) {
                if (A.charAt(start + i) != B.charAt(i)) break;
            }
            if (i == B.length()) return start;
            start++;
            end++;
        }
        return -1;
    }

    @Test
    public void t() {
        System.out.println(strStr("bbbbbbbbab", "baba"));
    }
}
