import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static boolean[][] visited;
    static int r;
    static int c;
    static int k;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        visited = new boolean[r][c];

        for(int i = 0; i < r; i++){
            String str = br.readLine();
            for(int j = 0; j < c; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        dfs(r - 1, 0,1);

        System.out.println(cnt);
    }

    static void dfs(int a, int b, int depth){
        if(depth == k){
            if(a == 0 && b == c - 1){
                cnt++;
            }
            return;
        }

        for(int d = 0; d < 4; d++){
            int nx = a + dx[d];
            int ny = b + dy[d];

            visited[a][b] = true;

            if(nx >= 0 && nx < r && ny >= 0 && ny < c){
                if(!visited[nx][ny] && arr[nx][ny] != 'T'){
                    visited[nx][ny] = true;
                    dfs(nx, ny, depth + 1);
                    visited[nx][ny] = false;
                }
            }
        }
    }
}
