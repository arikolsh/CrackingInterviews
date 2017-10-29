package problemsolving.ibit;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class MultiplyStrings {
    public String multiply(String a, String b) {
        if(a==null || b==null || a.isEmpty() || b.isEmpty()) return null;
        String aRev= reverseString(a);
        int i=0,j=0;
        Integer aCurr;Integer tmpRes;
        ArrayList<String> sums= new ArrayList<>();
        ArrayList<Integer> sumsInts= new ArrayList<>();
        while(i<aRev.length()){
            aCurr = Character.digit(aRev.charAt(i), 10);
            tmpRes=aCurr*Integer.parseInt(b);
            sumsInts.add(tmpRes);
            sums.add(tmpRes.toString());
        }
        String result = getTotalSum(sums);

       return result;
    }

    private String getTotalSum(ArrayList<String> sums) {
        String last= sums.get(0);
        for(int i=1;i<sums.size();i++){
            last= addStrings(last,sums.get(i));
        }
        return last;


    }

    private String addStrings(String a, String b) {
        String aRev = reverseString(a);
        String bRev = reverseString(b);
        Integer carry=0;
        Integer currA,currB,tmp;
        StringBuilder res=new StringBuilder();
        int i=0;int j=0;
        while(i<aRev.length() && j<bRev.length()){
            currA=Character.digit(aRev.charAt(i),10);
            currB=Character.digit(bRev.charAt(i),10);
            tmp = currA+currB+carry;
            res.append(tmp%10);
            carry = tmp >= 10 ? 1 : 0;
        }
        return res.reverse().toString();

    }

    private String reverseString(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}
