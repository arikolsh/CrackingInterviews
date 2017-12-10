package problemsolving.misc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ariko on 11/26/2017.
 */
public class StringPermutations {

    public ArrayList<String> solve(String s) {

        if (s == null || s.isEmpty()) { //todo: can this happen ?
            return new ArrayList<>();
        }
        if (s.length() == 1) {
            return new ArrayList<>(Arrays.asList(s));
        }
        ArrayList<String> perms = solve(s.substring(1));
        ArrayList<String> res = new ArrayList<>();
        Character currChar = s.charAt(0);
        for (String perm : perms) {
            for (int i = 0; i < perm.length(); i++) {
                res.add(String.format("%s%c%s", perm.substring(0, i), currChar, perm.substring(i)));
            }
            res.add(String.format("%s%c", perm, currChar));
        }
        return res;
    }

}
