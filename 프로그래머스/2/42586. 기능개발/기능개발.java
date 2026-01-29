import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int [] arr = new int[speeds.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        int day = arr[0];
        int cnt = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(day >= arr[i]){
                cnt++;
            }
            else{
                day = arr[i];
                list.add(cnt);
                cnt = 1;
            }
        }
        
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}