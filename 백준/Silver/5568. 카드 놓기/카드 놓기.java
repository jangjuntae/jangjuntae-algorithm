import java.io.*;
import java.util.HashSet;

public class Main {
    static int n, k;
    static String[] arr;
    static HashSet<String> set = new HashSet<String>();
    static boolean [] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new String[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        dfs(0, "");

        System.out.println(set.size());
    }

    static void dfs(int cnt, String str){
        if(cnt == k){
            set.add(str);
            return;
        }

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;

                dfs(cnt + 1, str + arr[i]);

                visited[i] = false;
            }
        }
    }
}
