import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr = new int[5][5];
    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                dfs(i, j, 0, "");
            }
        }

        System.out.println(set.size());
    }

    static void dfs(int a, int b, int depth, String str){
        if(depth == 6){
            set.add(Integer.parseInt(str));
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = a + dx[i];
            int ny = b + dy[i];

            if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5){
                dfs(nx, ny, depth + 1, str + arr[nx][ny]);
            }
        }
    }
}
