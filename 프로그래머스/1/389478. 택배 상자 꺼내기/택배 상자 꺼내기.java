class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int tmp = n / w + 2;
        
        int[][] box = new int[tmp][w];
        
        int k = 0;
        
        int cnt = 1;
        
        for(int i = 0; i < tmp; i++){
            int a = w - 1;
            
            for(int j = 0; j < w; j++){
                if(k % 2 == 0){
                    box[i][j] = cnt;
                }
                else{
                    box[i][a] = cnt;
                    a--;
                }
                
                cnt++;
                
                if(cnt > n){
                    break;
                }
            }
            
            if(cnt > n){
                break;
            }
            
            k++;
        }
        
        for(int i = 0; i < tmp; i++){
            for(int j = 0; j < w; j++){
                if(box[i][j] == num){
                    for(int t = i; t < tmp; t++){
                        if(box[t][j] != 0){
                            answer++;
                        }
                    }
                    
                    return answer;
                }
            }
        }
        
        return answer;
    }
}