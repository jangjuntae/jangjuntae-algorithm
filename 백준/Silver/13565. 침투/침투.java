import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] arr;
    static boolean[][] visited;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        boolean result = false;

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < m; i++){
            if(arr[0][i] == 0 && !visited[0][i]){
                queue.add(new int[]{0, i});
                visited[0][i] = true;

                while(!queue.isEmpty()){
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];

                    for(int j = 0; j < 4; j++){
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0){
                            if(!visited[nx][ny]){
                                queue.add(new int[]{nx, ny});
                                visited[nx][ny] = true;
                            }
                        }
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            if(visited[n - 1][i]){
                result = true;
            }
        }

        if(result){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
