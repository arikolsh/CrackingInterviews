package problemsolving.algo;

import lombok.AllArgsConstructor;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class NChooseK {

    ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        int sum = B;
        ArrayList<Integer> candidates = A;
        Collections.sort(candidates, Comparator.comparingInt(x -> x));
        rec(candidates, 0, sum, new TreeSet<Integer>());
        Collections.sort(res, (x, y) -> compareLists(x, y));
        return res;
    }

    private void rec(ArrayList<Integer> candidates, int start, int sum, Set<Integer> set) {
        if (sum < 0 || start >= candidates.size()) {
            return;
        }
        if (sum == 0) {
            res.add(new ArrayList<>(set));
            return;
        }
        Set<Integer> with = new TreeSet<>(set);
        with.add(candidates.get(start));
        rec(candidates, start, sum - candidates.get(start), with); //add
        rec(candidates, start + 1, sum, set); //dont add
    }

    private int compareLists(List<Integer> x, List<Integer> y) {
        int compare = x.size() - y.size();
        if (compare != 0) {
            return compare;
        }
        for (int i = 0; i < x.size(); i++) {
            compare = x.get(i) - y.get(i);
            if (compare != 0) return compare;
        }
        return compare;
    }

    @Test
    public void t() {
        // combinationSum(new ArrayList<>(Arrays.asList(1, 16)), 28);
        Character n = 'b';
        System.out.println((int) n);
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("goodbye");
        String str = "hellohello hello";
        String hello = str.replace("hello", "");
        System.out.println(str);
        System.out.println(hello);
        System.out.println((str.length() - hello.length()) / "hello".length());
    }
}
