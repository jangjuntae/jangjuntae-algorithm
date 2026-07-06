import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            
            if(n % 2 != 0){
                System.out.println("#" + t + " No");
                continue;
            }
            
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            
            for(int i = 0; i < n / 2; i++){
                sb1.append(str.charAt(i));
                sb2.append(str.charAt(i + (n / 2)));
            }
            
            if(sb1.toString().equals(sb2.toString())){
                System.out.println("#" + t + " Yes");
            }
            else {
            	System.out.println("#" + t + " No");
            }
        }
    }
}
