import java.util.*;
import java.io.*;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String str = br.readLine();
        
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	sum += str.charAt(i) - '0';
        }
        
        System.out.println(sum);
    }
}