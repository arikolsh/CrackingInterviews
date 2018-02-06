package problemsolving.ibit;

import org.junit.Test;

import java.util.ArrayList;

public class GenPars {
    ArrayList<String> res = new ArrayList<>();
    public ArrayList<String> generateParenthesis(int A) {
        if(A>0){
            rec(A,A,"");
        }
        return res;
    }

    public void rec(int leftPar, int rightPar, String str){
        if(leftPar<0 || rightPar<leftPar) return;
        if(leftPar == 0 && rightPar == 0){
            res.add(str.toString());
            return;
        }
        if(leftPar>0){
            rec(leftPar - 1,rightPar,str+"(");
        }
        if(rightPar>leftPar){
            rec(leftPar,rightPar - 1,str+")");
        }
    }

    @Test
    public void t(){

        System.out.println(generateParenthesis(3));

    }
}
