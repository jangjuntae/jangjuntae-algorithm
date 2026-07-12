import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String op : operations){
            String[] s = op.split(" ");
            
            String cmd = s[0];
            int num = Integer.parseInt(s[1]);
            
            if(cmd.equals("I")){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else{
                if(map.isEmpty()){
                    continue;
                }
                
                if(num == 1){
                    int key = map.lastKey();
                    
                    if(map.get(key) == 1){
                        map.remove(key);
                    }
                    else{
                        map.put(key, map.get(key) - 1);
                    }
                }
                else{
                    int key = map.firstKey();
                    
                    if(map.get(key) == 1){
                        map.remove(key);
                    }
                    else{
                        map.put(key, map.get(key) - 1);
                    }
                }
            }
        }
        
        if(map.isEmpty()){
            return new int[]{0, 0};
        }
        else{
            return new int[]{map.lastKey(), map.firstKey()};
        }
    }
}