import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static int n;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        dfs(0);
    }

    public static void dfs(int cnt){
        if(cnt == n){
            for(int i = 0; i < n; i++){
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[cnt] = arr[i];
                dfs(cnt + 1);
                visited[i] = false;
            }
        }
    }
}
