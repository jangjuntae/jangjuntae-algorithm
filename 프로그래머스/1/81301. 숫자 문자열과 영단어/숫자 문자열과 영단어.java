class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] str = {
            "zero", "one", "two", "three",
            "four", "five", "six", "seven", 
            "eight", "nine"
        };
        
        for(int i = 0; i < str.length; i++){
            s = s.replaceAll(str[i], String.valueOf(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}