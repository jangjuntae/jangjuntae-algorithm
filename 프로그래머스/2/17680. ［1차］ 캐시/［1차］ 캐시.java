import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        int answer = 0;
        LinkedList<String> list = new LinkedList<>();
        
        for(String city : cities){
            String s = city.toLowerCase();
            
            if(list.contains(s)){
                answer++;
                list.remove(s);
                list.add(s);
            }
            else{
                if(list.size() >= cacheSize){
                    list.removeFirst();
                }
                list.add(s);
                answer += 5;
            }
        }

        return answer;
    }
}