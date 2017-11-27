package problemsolving.ibit;

import java.util.ArrayList;

public class LCS {
    public String longestCommonPrefix(ArrayList<String> a) {
        if (a == null || a.size() == 0) return null;
        int maxLength= a.stream().mapToInt(String::length).max().getAsInt();
        int i=0;
        while(i<maxLength){
            Character curr = a.get(0).charAt(i);
            for(String s: a){
                if(s.charAt(i)!=curr){
                    return s.substring(0,i);
                }
            }
            i++;
        }
        return a.get(0).substring(0,maxLength);
    }



}
