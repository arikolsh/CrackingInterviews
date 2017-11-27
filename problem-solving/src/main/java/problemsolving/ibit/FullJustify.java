package problemsolving.ibit;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class FullJustify {
    public ArrayList<String> solve(ArrayList<String> a, int b) {
        if(a==null || a.size()==0) return null;
        ArrayList<ArrayList<String>> buckets = new ArrayList<>();
        int i = 0;
        int capacity;
        //create buckets of strings
        while (i < a.size()) {
            capacity = b;
            //init new bucket
            buckets.add(new ArrayList<String>());
            capacity = capacity - a.get(i).length(); //first word in sentence
            while (capacity >= 0) {
                buckets.get(buckets.size() - 1).add(a.get(i));
                i += 1;
                if (i >= a.size()) {
                    break;
                }
                //first check capacity
                capacity = capacity - a.get(i).length() - 1; //minus one space before word
            }
        }
        ArrayList<String> res= new ArrayList<>();
        for(ArrayList<String> bucket : buckets){
            res.add(getJustifiedString(bucket,b));

        }
        //resolve amount of spaces between words
        String curr = getJustifiedString(buckets.get(0), b);
        return res;

    }

    private String getJustifiedString(ArrayList<String> strings, int b) {
        StringBuilder strBuild = new StringBuilder();
        if(strings.size() == 1){
            strBuild.append(strings.get(0));
            int spaces = b - strings.get(0).length();
            while(spaces>0){
                strBuild.append(" ");
                spaces--;
            }
            return strBuild.toString();
        }
        int numSpaceLocations = strings.size() - 1;
        int extraSpace = b - strings.stream().mapToInt(String::length).sum() - numSpaceLocations;
        int minExtraSpacePerLocation = Math.floorDiv(extraSpace,numSpaceLocations);
        int maxExtraSpace = extraSpace - minExtraSpacePerLocation * (numSpaceLocations - 1);
        //first word
        strBuild.append(strings.get(0));
        for (int i = 0; i < maxExtraSpace + 1; i++) {
            strBuild.append(" ");
        }
        int i = 1, j = 0;
        while (i < strings.size()) {
            strBuild.append(strings.get(i)); //get next string
            i++;
            while (i < strings.size() && j < minExtraSpacePerLocation + 1) { //add spaces after each word but not after last
                strBuild.append(" ");
                j++;
            }
        }
        return strBuild.toString();
    }


}
