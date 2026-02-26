import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int k = 1;
        
        while(true){
            if(k == n){
                break;
            }
            
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n -= 1;
                ans++;
            }
        }

        return ans;
    }
}