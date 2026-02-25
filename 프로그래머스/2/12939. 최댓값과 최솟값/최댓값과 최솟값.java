import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            else{
                String str = sb.toString();
                arr.add(Integer.parseInt(str));
                sb = new StringBuilder();
            }
        }
        
        String str = sb.toString();
        arr.add(Integer.parseInt(str));
        
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        
        return min + " " + max;
    }
}