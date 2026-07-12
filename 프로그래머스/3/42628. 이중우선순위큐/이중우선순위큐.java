import java.util.*;
import java.io.*;

class Solution {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
    public int[] solution(String[] operations) {
        int n = operations.length;
        
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(operations[i]);
            String str = st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            
            if(str.equals("I")){
                maxHeap.offer(k);
                minHeap.offer(k);
            }
            else{
                if(k < 0 && !minHeap.isEmpty()){ // 최소값
                    int tmp = minHeap.poll();
                    maxHeap.remove(tmp);
                }
                else if(k > 0 && !maxHeap.isEmpty()){ // 최대값
                    int tmp = maxHeap.poll();
                    minHeap.remove(tmp);
                }
            }
        }
        
        int[] result = new int[2];
        
        if(!maxHeap.isEmpty()){
            result[0] = maxHeap.poll();   
        }
        if(!minHeap.isEmpty()){
            result[1] = minHeap.poll();
        }
        
        return result;
    }
}