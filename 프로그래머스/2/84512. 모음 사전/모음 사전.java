import java.util.*;

class Solution {
    LinkedList<String> list = new LinkedList<>();
    String[] str = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer = 0;
        
        dfs("");
        
        answer = list.indexOf(word);
        
        return answer;
    }
    
    public void dfs(String s){
        list.add(s);
        
        if(s.length() == 5) return;
        
        for(int i = 0; i < 5; i++){
            dfs(s + str[i]);
        }
    }
}