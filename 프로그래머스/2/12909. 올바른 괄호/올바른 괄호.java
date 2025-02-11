        import java.util.*;
        class Solution {
            boolean solution(String s) {
                boolean answer = true;

                Stack<Character>stack = new Stack<>();

                for(char c:s.toCharArray()){
                    if(!stack.isEmpty()&&c!=stack.peek()){
                        stack.pop();
                    }
                    else if(stack.isEmpty()&&c==')'){
                        return false;
                    }
                    else{
                        stack.push(c);
                    }
                }
                return stack.size()==0?true:false;

            }
        }