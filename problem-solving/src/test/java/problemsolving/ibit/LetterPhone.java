package problemsolving.ibit;

import org.junit.Test;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by ariko on 12/6/2017.
 */
public class LetterPhone {

    private static final Map<Integer, List<Character>> digitsMap = new HashMap<>();

    static {
        digitsMap.put(1, asList('1'));
        digitsMap.put(2, asList('a', 'b', 'c'));
        digitsMap.put(3, asList('d', 'e', 'f'));
        digitsMap.put(4, asList('g', 'h', 'i'));
        digitsMap.put(5, asList('j', 'k', 'l'));
        digitsMap.put(6, asList('m', 'n', 'o'));
        digitsMap.put(7, asList('p', 'q', 'r', 's'));
        digitsMap.put(8, asList('t', 'u', 'v'));
        digitsMap.put(9, asList('w', 'x', 'y', 'z'));
        digitsMap.put(0, asList('0'));
    }


    public ArrayList<String> letterCombinations(String a) {
        if (a == null || a.isEmpty()) return new ArrayList<>();
        Set<String> set = new HashSet<>();
        char[] letters = a.toCharArray();
        util(letters, set, new StringBuilder(), 0);
        ArrayList<String> strings = new ArrayList<>(set);
        Collections.sort(strings);
        return strings;
    }

    private void util(char[] letters, Set<String> set, StringBuilder stringBuilder, int i) {
        System.out.println(stringBuilder);
        if (i >= (letters.length) && !set.contains(stringBuilder.toString())) {
            set.add(stringBuilder.toString());
            return;
        }
        char letter = letters[i];
        for (Character c : digitsMap.get(Integer.parseInt("" + letter))) {
            StringBuilder s = new StringBuilder(stringBuilder.toString());
            s.append(c);
            util(letters, set, s, i + 1);
        }
    }

    //kewl

    @Test
    public void t(){
        main();
    }

    public static void main(String ... args) {
        System.out.println(new LetterPhone().letterCombinations("3"));
    }


}
