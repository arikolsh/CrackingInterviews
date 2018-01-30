package problemsolving.crackingTheCode;

import org.junit.Test;

import java.util.Arrays;

public class ReverseCStyleString {

    public void solve(char[] str) {

        int i = 0;
        while (i < str.length / 2) {
            swap(str, i, str.length - i - 1);
            i++;
        }

    }

    private void swap(char[] str, int i, int j) {
        char tmp = str[i];
        str[i] = str[j];
        str[j] = tmp;
    }

    @Test
    public void t() {

        char[] str = {'h', 'e', 'l', 'l','o' ,'\0'};
        new ReverseCStyleString().solve(str);
        System.out.println(str);

    }


}
