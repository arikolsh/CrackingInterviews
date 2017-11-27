package problemsolving.ibit;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        ArrayList<Integer> arr= new ArrayList<>(a); //make a copy
        Collections.sort(arr);
        int n = arr.size();
        Boolean doRemoveLast = false;
        if(n%2==1){
            //duplicate the last one and remove in the end
            arr.add(arr.get(n-1));
            doRemoveLast =true;
            n+=1; //increment size
        }
        for(int i=0;i<n;i+=2){
            swap(arr,i,i+1);
        }
        if(doRemoveLast){
            arr.remove(n-1);
        }
        return arr;
    }

    public void swap(ArrayList<Integer> arr,Integer i,Integer j){
        Integer tmp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,tmp);
    }

}
