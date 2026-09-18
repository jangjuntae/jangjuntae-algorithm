import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int tc = 1; tc <= T; tc++){
            long n = Long.parseLong(br.readLine());

            int answer = 0;

            while(n != 2){
                long k = (long) Math.sqrt(n);

                if(k * k == n){
                    n = k;
                    answer++;
                }
                else{
                    long next = k + 1;
                    long next2 = next * next;

                    answer += (int) (next2 - n);
                    n = next2;
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}
