package problemsolving.crackingTheCode;

import org.junit.Test;

public class RemoveDupStr {

    public void solve(char[] str) {
        if (str == null) return;
        int j = 0;
        int i = 0;
        for (; i < str.length && j < str.length; i++) {
            str[i] = str[j];
            char c = str[i];
            while (j < str.length && str[j] == c) {
                j++;
            }
        }
        while (i < j) str[i++] = '\0';
    }

    @Test
    public void t() {

        String str = "abaaababasssb";
        char[] cstr = getChars(str);
        System.out.println(cstr);
        new RemoveDupStr().solve(cstr);
        System.out.println(cstr);

    }

    private char[] getChars(String str) {
        char[] cstr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) cstr[i] = str.charAt(i);
        return cstr;
    }
}
