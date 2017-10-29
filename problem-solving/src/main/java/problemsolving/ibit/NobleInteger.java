package problemsolving.ibit;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Given an integer array, find if an integer p exists in the array such that the number of integers greater than p
 * in the array equals to p If such an integer is found return 1 else return -1.
 */
public class NobleInteger {

    public int naiveSolve(ArrayList<Integer> A) {
        ArrayList<Integer> cpyA = new ArrayList<>(A);
        Collections.sort(cpyA);
        Integer total = 0,same=0;
        Integer curr;
        Integer last = cpyA.get(cpyA.size()-1);
        for (int i = cpyA.size() - 1; i >= 0; i--) {
            curr = cpyA.get(i);
            if (curr == last) {
                same += 1;
            } else {
                total += same;
                same = 1;
            }
            if (curr.equals(total)) {
                return 1;
            }
            last = curr;
        }
        return -1;
    }

    private <T> void removeDuplicates(List<T> lst) {
        Set<T> set = new HashSet<>();
        set.addAll(lst);
        lst.clear();
        lst.addAll(set);
    }


}
