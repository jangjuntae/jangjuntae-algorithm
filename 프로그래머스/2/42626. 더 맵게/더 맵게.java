import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        int a = -1;
        int b;
        
        while(!pq.isEmpty()){
            a = pq.poll();
            
            if(a >= K || pq.isEmpty()){
                break;
            }
            
            b = pq.poll();
            
            pq.offer(a + b * 2);
            answer++;
        }
        
        if(a < K){
            answer = -1;
        }
        
        return answer;
    }
}