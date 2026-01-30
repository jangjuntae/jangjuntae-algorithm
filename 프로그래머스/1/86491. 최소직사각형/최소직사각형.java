class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        for(int i = 0; i < sizes.length; i++){
            a = Math.max(sizes[i][0], a);
            b = Math.max(sizes[i][1], b);
        }
        
        return a * b;
    }
}