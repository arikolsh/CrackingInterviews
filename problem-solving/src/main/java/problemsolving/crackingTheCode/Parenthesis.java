package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Parenthesis {

    private Set<String> set = new HashSet<>();

    @Test
    public void t() {
        int i = 3;
        solve(i);
    }

    private void solveBad(int i) {

        utilBad("", i, i);
        System.out.println(set);

    }

    private void solve(int i) {
        util("", i, i);
    }

    private void util(String s, int left, int right) {
        if (left < 0 || right < left) return; //not a valid syntax
        if (right == 0 && left == 0) {
            System.out.println(s);
            return;
        }
        if (left > 0) { //there are still left parenthesis left
            util(s + "(", left - 1, right);
        }
        if (right > left) { //cant add right parenthesis if no left to counter it
            util(s + ")", left, right - 1);
        }

    }

    private void utilBad(String str, int left, int right) {
        if (left < 0 || right < 0) return;
        if (left == 0 && right == 0) set.add(str);
        utilBad("(" + str, left - 1, right);
        utilBad(str + ")", left, right - 1);
        utilBad(str + "(" + ")", left - 1, right - 1);
    }
}
