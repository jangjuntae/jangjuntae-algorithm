class Solution {
    public int answer;
    public int num;
    public int[][] arr;
    public int[] res;
    
    public int solution(int n, int[][] q, int[] ans) {
        num = n;
        arr = q;
        res = ans;
        
        int[] selected = new int[5];
        
        dfs(1, 0, selected);
        
        return answer;
    }
    
    public void dfs(int start, int depth, int[] selected){
        if(depth == 5){
            if(isValid(selected)){
                answer++;
            }
            
            return;
        }
        
        for(int i = start; i <= num; i++){
            selected[depth] = i;
            dfs(i + 1, depth + 1, selected);
        }
    }
    
    public boolean isValid(int[] selected){
        for(int i = 0; i < arr.length; i++){
            int cnt = 0;
            
            for(int a : selected){
                for(int b : arr[i]){
                    if(a == b){
                        cnt++;
                    }
                }
            }
            
            if(cnt != res[i]){
                return false;
            }
        }
        
        return true;
    }
}