class Solution {
    boolean[] visited;
    int[][] arr;
    int max = Integer.MIN_VALUE;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        arr = dungeons;
        visited = new boolean[arr.length];
        
        dfs(0, k);
        
        return max;
    }
    
    public void dfs(int depth, int k){
        max = Math.max(max, depth);

        for(int i = 0; i < arr.length; i++){
            if(!visited[i] && arr[i][0] <= k){
                visited[i] = true;
                dfs(depth + 1, k - arr[i][1]);
                visited[i] = false;
            }
        }
    }
}