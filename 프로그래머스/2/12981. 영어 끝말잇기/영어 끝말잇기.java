import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int[] result = {1, 1};
        boolean ox = true;
        HashSet<String> hs = new HashSet<>();
        
        hs.add(words[0]);

        for(int i = 1; i < words.length; i++){
            if(result[0] == n){
                result[0] = 1;
                result[1]++;
            }
            else{
                result[0]++;
            }
            
            if(hs.contains(words[i])){
                ox = false;
                break;
            }
            else if((words[i].charAt(0) != (words[i-1]).charAt(words[i-1].length()-1))){
                ox = false;
                break;
            }
            else{
                hs.add(words[i]);
            }
        }
        
        if(!ox){
            answer = result;
        }

        return answer;
    }
}