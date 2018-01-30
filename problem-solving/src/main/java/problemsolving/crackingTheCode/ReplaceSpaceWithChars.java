package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.ArrayList;

public class ReplaceSpaceWithChars {

    public char[] solve(char[] str) {

        ArrayList<Character> resLst = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == ' ') {

                resLst.add('%');
                resLst.add('2');
                resLst.add('0');

            } else {
                resLst.add(c);
            }
        }

        char[] res = new char[resLst.size()];
        for (int i = 0; i < resLst.size(); i++) res[i] = resLst.get(i);
        return res;
    }

    @Test
    public void t() {

        char[] cstr = getChars("man in the mirror");
        System.out.println(solve(cstr));


    }

    private char[] getChars(String str) {
        char[] cstr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) cstr[i] = str.charAt(i);
        return cstr;
    }
}
