package problemsolving.ibit;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Given an integer array, find if an integer p exists in the array such that the number of integers greater than p
 * in the array equals to p If such an integer is found return 1 else return -1.
 */
public class NobleInteger {

        public int naiveSolve(ArrayList<Integer> A) {
            ArrayList<Integer> sortedA = new ArrayList<>(A);
            Collections.sort(sortedA);
            HashSet<Integer> set= sortedA.stream().collect(Collectors.toSet(Integer::intValue))
            Integer accNumber = 0;
            int last= sortedA.get(sortedA.size()-1);
            Integer curr;
            for (int i = sortedA.size() - 1; i >= 0; i--){
                curr = sortedA.get(i);
                if(curr.equals(accNumber)){
                    return 1;
                }
                if(sortedA.get(i)!=last) {
                    accNumber += 1;
                }
                last=curr;
            }
            return -1;
        }




}
