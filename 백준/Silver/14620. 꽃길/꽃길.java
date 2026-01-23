import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int [][] board;
    static boolean[][] visited;
    static int result = Integer.MAX_VALUE;
    static int [] dx = {0, -1, 0, 1, 0};
    static int [] dy = {0, 0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(result);
    }

    public static void dfs(int depth, int sum){
        if(depth == 3){
            result = Math.min(result, sum);
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                boolean check = true;

                for(int k = 0; k < 5; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if(visited[nx][ny]){
                        check = false;
                        break;
                    }
                }

                if(check){
                    int cost = 0;
                    for(int k = 0; k < 5; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        cost += board[nx][ny];
                        visited[nx][ny] = true;
                    }

                    dfs(depth + 1, cost + sum);

                    for(int k = 0; k < 5; k++){
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        visited[nx][ny] = false;
                    }
                }
            }
        }
    }
}
