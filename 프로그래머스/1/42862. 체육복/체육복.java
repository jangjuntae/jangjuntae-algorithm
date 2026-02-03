class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] student = new int[n];
        
        for(int i = 0; i < n; i++){
            student[i] = 1;
        }
        
        for(int i = 0; i < lost.length; i++){
            student[lost[i] - 1]--;
        }
        
        for(int i = 0; i < reserve.length; i++){
            student[reserve[i] - 1]++;
        }
        
        for(int i = 0; i < n; i++){
            if(student[i] == 0){
                if(i > 0 && student[i - 1] == 2){
                    student[i - 1]--;
                    student[i]++;
                }
                else if(i < n - 1 && student[i + 1] == 2){
                    student[i + 1]--;
                    student[i]++;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(student[i] > 0){
                answer++;
            }
        }
        
        return answer;
    }
}