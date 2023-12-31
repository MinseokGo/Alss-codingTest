import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(0) == ')') {
                return false;
            }
            char c = s.charAt(i);
            if(c == '(') stack.push(c);
            else if(c == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(stack.isEmpty() && s.length() != 0) answer = true;
            
        return answer;
    }
}