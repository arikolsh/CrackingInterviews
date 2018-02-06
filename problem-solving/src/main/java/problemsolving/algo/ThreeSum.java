package problemsolving.algo;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;

public class ThreeSum {

    public boolean TwoSUM(Integer[] arr, int sum, int ignored) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == ignored) continue;
            if (set.contains(sum - arr[i])) return true;
            set.add(arr[i]);
        }
        return false;

    }

    public boolean TwoSUMv2(List<Integer> sorted, int sum, int ignored) {
        List<Integer> lst = new ArrayList<>(sorted);
        lst.indexOf(ignored);
        lst.remove(lst.indexOf(ignored));
        int left = 0;
        int right = lst.size() - 1;
        while (left <= right) {
            int s = lst.get(left) + lst.get(right);
            if (s == sum) return true;
            else if (s < sum) left++;
            else right--;
        }
        return false;

    }


    public boolean ThreeSumZero(Integer[] arr) {
        List<Integer> sorted = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(sorted);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (TwoSUM(arr, -arr[i], i)) return true;
            //if (TwoSUM(sorted, -arr[i], arr[i])) return true;
        }
        return false;

    }

}
