package problemsolving.ibit;

import java.util.List;

/**
 * Created by ariko on 10/28/2017.
 */
public class BinaryClosestFind {
    public int solve(int x, List<Integer> arr) {

        int lo=0,hi=arr.size()-1;
        int closest = lo;
        int mid;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(arr.get(mid) < x){
                lo = mid + 1;
            }
            else if(arr.get(mid) > x){
                hi = mid - 1;
            }
            else{
                closest = mid ;
                break;
            }
            //check for better diff
            int diff = Math.abs(x - arr.get(mid));
            if(diff < Math.abs(x-closest)){
                closest = arr.get(mid);
            }
        }
        return closest;
    }

}
