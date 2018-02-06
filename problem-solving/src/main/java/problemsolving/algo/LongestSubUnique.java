package problemsolving.algo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubUnique {
    //Find the longest substring with K unique characters.
    public int solve(String s, int k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int max = -1;
        //sliding window
        int start = 0;
        int end = 0;
        while (end < s.length() && start < s.length()) {
            //here need to check if changed max and update start max and end max
            char c = s.charAt(end);
            if (map.size() == k) {
                max = Math.max(max, end - start + 1);
                start = getMinPosAndRemove(map) + 1;
            }
            map.put(c, end);
            end++;
        }
        System.out.println(s.substring(start,end));
        return max;
    }

    public int getMinPosAndRemove(Map<Character, Integer> map) {
        Integer min = Integer.MAX_VALUE;
        Character charToRemove = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (min > entry.getValue()) {
                min = entry.getValue();
                charToRemove = entry.getKey();
            }
        }
        map.remove(charToRemove);
        return min;
    }

    @Test
    public void t() {
        System.out.println(solve("aabbccdd",3));
    }

}
