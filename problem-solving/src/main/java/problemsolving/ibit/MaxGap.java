package problemsolving.ibit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.*;

public class MaxGap {

    public int maximumGapNaive(final List<Integer> a) {
        int maxDist = 0;
        int left = 0, right = 0;
        while (left < a.size()) {
            while (right < a.size()) {
                if (a.get(left) <= a.get(right)) {
                    if ((right - left) > maxDist) {
                        maxDist = right - left;
                    }
                }
                right++;
            }
            left++;
            right = left;
        }
        return maxDist;
    }

}
