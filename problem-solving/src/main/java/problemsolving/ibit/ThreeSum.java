package problemsolving.ibit;

import java.util.ArrayList;

/**
 * Created by ariko on 10/28/2017.
 */
public class ThreeSum {
    public int solve(ArrayList<Integer> a, int b) {
        if(a.size()<3){
            return 1000000000;
        }
        int minSum = a.get(0) + a.get(1) + a.get(2);
        int movingSum  = minSum;
        int back=0,front=3;
        while(front < a.size()){
            //System.out.println("front: "+a.get(front));
            //System.out.println("back: "+a.get(back));
            movingSum = movingSum - a.get(back) + a.get(front);
            if(movingSum==0){
                System.out.println();
            }
            //System.out.println("moving-sum: "+movingSum);
            if( dist(minSum,b) > dist(movingSum,b) ){
                minSum = movingSum;
            }
            back++;
            front++;
        }
        return minSum;


    }

    public int dist(int a,int b){//return |a-b|
        return Math.abs(a-b);
    }
}
