import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        int[] arr = new int[elements.length * 2];
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < elements.length; i++){
            arr[i] = elements[i];
            arr[i + elements.length] = elements[i];
        }
        
        for(int i = 0; i < elements.length; i++){
            int sum = 0;
            
            for(int j = 0; j < elements.length; j++){
                sum += arr[i + j];
                hs.add(sum);
            }
        }
        
        answer = hs.size();
        
        return answer;
    }
}