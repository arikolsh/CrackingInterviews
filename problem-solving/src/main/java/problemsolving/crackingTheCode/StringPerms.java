package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.ArrayList;

public class StringPerms {

    public ArrayList<String> solve(String str) {
        ArrayList<String> perms = getStringPerms(str);
        return perms;
    }

    private ArrayList<String> getStringPerms(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null) return res;
        if (str.length() == 0) {
            res.add("");
            return res;
        }
        char currChar = str.charAt(0);
        ArrayList<String> perms = getStringPerms(str.substring(1));
        for (String perm : perms) {
            for (int i = 0; i < perm.length() + 1; i++) {
                res.add(insertChar(perm, currChar, i));
            }
        }
        return res;
    }

    private String insertChar(String str, char c, int at) {
        String res = str.substring(0, at) + c + str.substring(at);
        return res;
    }

    private char[] getChars(String str) {
        char[] res = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i);
        }
        return res;
    }

    @Test
    public void t() {
        System.out.println(solve("ab"));
    }
}
