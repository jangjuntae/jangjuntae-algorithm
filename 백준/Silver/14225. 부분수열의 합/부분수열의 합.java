import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int [] arr;
    static boolean [] visited = new boolean[2000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        for(int i = 1; i <= 2000000; i++){
            if(!visited[i]){
                System.out.println(i);
                break;
            }
        }
    }

    public static void dfs(int depth, int sum){
        if(depth == n){
            visited[sum] = true;
            return;
        }

        dfs(depth + 1, sum + arr[depth]);

        dfs(depth + 1, sum);
    }
}
