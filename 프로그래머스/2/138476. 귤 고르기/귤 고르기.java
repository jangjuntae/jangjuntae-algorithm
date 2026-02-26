import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        int n = tangerine.length;
        
        int[] arr = new int[10000001];
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            arr[tangerine[i]]++;
        }
        
        for(int i = 0; i < 10000001; i++){
            if(arr[i] != 0){
                array.add(arr[i]);
            }
        }
        
        Collections.sort(array, Collections.reverseOrder());
        
        int target = 0;
        
        for(int i = 0; i < array.size(); i++){
            target += array.get(i);
            if(target >= k){
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}