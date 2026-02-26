class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        while(true){
            boolean correct = true;
            for(int i = 0; i < arr.length; i++){
                if(answer % arr[i] != 0){
                    correct = false;
                }
            }
            if(correct){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}