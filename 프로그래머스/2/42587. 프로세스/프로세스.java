import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int n = priorities.length;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            q.offer(new int[] {priorities[i], i});
        }
        
        Arrays.sort(priorities);
        
        int i = n - 1;
        
        while(true){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            
            if(priorities[i] == x && y == location){
                answer++;
                break;
            }
            else if(priorities[i] == x){
                answer++;
                i--;
            }
            else{
                q.offer(new int[] {x, y});
            }
        }
        
        return answer;
    }
}