import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int [] arr;
    static boolean[] visited;
    static int[] result;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(dfs(0));
    }

    public static int dfs(int depth){
        if(depth == n){
            int sum = 0;
            for(int i = 0; i < n - 1; i++){
                sum += Math.abs(result[i] - result[i + 1]);
            }
            return sum;
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = arr[i];
                int result = dfs(depth + 1);
                max = Math.max(max, result);
                visited[i] = false;
            }
        }
        return max;
    }
}
