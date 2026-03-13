import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            tmp = tmp - k;
            arr[i] = tmp;
        }

        dfs(0, 500);

        System.out.println(answer);
    }

    public static void dfs(int depth, int weight){
          if(depth == n){
              if(weight >= 500){
                  answer++;
              }
              return;
          }

          if(weight < 500){
              return;
          }

          for(int i = 0; i < n; i++){
              if(!visited[i]){
                  visited[i] = true;
                  dfs(depth + 1, weight + arr[i]);
                  visited[i] = false;
              }
          }
    }
}
