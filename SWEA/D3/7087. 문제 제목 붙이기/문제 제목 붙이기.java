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
            
            String[] str = new String[n];
            int[] arr = new int[26];
            
            for(int i = 0; i < n; i++) {
            	str[i] = br.readLine();
            }
            
            for(int i = 0; i < n; i++) {
            	 arr[str[i].charAt(0) - 'A']++;
            }
            
            int result = 0;
            
            for(int i = 0; i < 26; i++) {
            	if(arr[i] != 0) {
            		result++;
            	}
            	else {
            		break;
            	}
            }
            
            System.out.println("#" + t + " " + result);
        }
    }
}
