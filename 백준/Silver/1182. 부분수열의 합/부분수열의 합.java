import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int s;
    static int [] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

       st = new StringTokenizer(br.readLine());

       for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
       }

       dfs(0, 0);

       if(s == 0){
           cnt--;
       }
       System.out.println(cnt);
    }

    public static void dfs(int depth, int sum){
        if(sum == s){
            cnt++;
        }

        for(int i = depth; i < n; i++){
            dfs(i + 1, sum + arr[i]);
        }
    }
}
