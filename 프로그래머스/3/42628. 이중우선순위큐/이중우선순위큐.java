import java.util.*;
import java.io.*;

class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> lazyMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> lazyMinHeap = new PriorityQueue<>();
    
    public void progate(){
        while(!lazyMaxHeap.isEmpty() && maxHeap.peek() == lazyMaxHeap.peek()){
            maxHeap.poll();
            lazyMaxHeap.poll();
        }
        
        while(!lazyMinHeap.isEmpty() && minHeap.peek() == lazyMinHeap.peek()){
            minHeap.poll();
            lazyMinHeap.poll();
        }
    }
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        for(int i = 0; i < operations.length; i++){
            progate();
            
            String[] query = operations[i].split(" ");
            int num = Integer.parseInt(query[1]);
            
            if(query[0].equals("I")){
                maxHeap.offer(num);
                minHeap.offer(num);
            }
            else{
                if(maxHeap.isEmpty()) continue;
                
                if(num == 1){
                    lazyMinHeap.offer(maxHeap.peek());
                    maxHeap.poll();
                }
                else{
                    lazyMaxHeap.offer(minHeap.peek());
                    minHeap.poll();
                }
            }
        }
        
        progate();
        
        if(!maxHeap.isEmpty()){
            answer[0] = maxHeap.peek();
            answer[1] = minHeap.peek();
        }
        
        return answer;
    }
}