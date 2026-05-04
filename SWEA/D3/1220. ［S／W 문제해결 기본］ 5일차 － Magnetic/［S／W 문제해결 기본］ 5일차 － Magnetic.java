import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String args[]) throws Exception
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	for(int t = 1; t <= 10; t++) {
    		int num = Integer.parseInt(br.readLine());
    		
    		int[][] arr = new int[100][100];
    		
    		for(int i = 0; i < 100; i++) {
    			st = new StringTokenizer(br.readLine());
    			
    			for(int j = 0; j < 100; j++) {
    				arr[i][j] = Integer.parseInt(st.nextToken());
    			}
    		}
    		
    		int result = 0;
    		
    		for(int j = 0; j < 100; j++) {
    			Stack<Integer> stack = new Stack<>();
    			
    			for(int i = 0; i < 100; i++) {
    				if(arr[i][j] == 1) {
    					stack.add(arr[i][j]);
    				}
    				else if(arr[i][j] == 2 && !stack.isEmpty()){
						result++;
						stack.clear();
    				}
    			}
    		}
    		
    		System.out.println("#" + t + " " + result);
    	}
    }
}
