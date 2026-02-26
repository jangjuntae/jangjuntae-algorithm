import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i) + s.substring(0, i);
            
            Stack<Character> stack = new Stack<>();
            boolean ox = true;
            
            for(char c : str.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }
                else{
                    if (stack.isEmpty()) {
                        ox = false;
                        break;
                    }
                    char top = stack.pop();
                    
                    if((c == ')' && top != '(') || 
                       (c == ']' && top != '[') || 
                       (c == '}' && top != '{')){
                        ox = false;
                        break;
                    }
                }
            }
            if(ox && stack.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}