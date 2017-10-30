package problemsolving.worker;

import java.util.Stack;

public class BalancedParanthesis {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(c.equals('(')){
                stack.push(c);
            }
            if(c.equals(')')){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){ return false; }
        return true;
    }
}
