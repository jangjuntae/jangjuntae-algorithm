import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            q.offer(0);
        }
        
        int currentWeight = 0;
        int truckIndex = 0;
        
        while(truckIndex < truck_weights.length){
            answer++;
            
            currentWeight -= q.poll();
            
            if(currentWeight + truck_weights[truckIndex] <= weight){
                q.offer(truck_weights[truckIndex]);
                currentWeight += truck_weights[truckIndex];
                truckIndex++;
            }
            else{
                q.offer(0);
            }
        }
        
        answer += bridge_length;
        
        return answer;
    }
}