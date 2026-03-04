import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static char[][] campus;
    static boolean[][] visited;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        campus = new char[n][m];
        visited = new boolean[n][m];
        int a = 0, b = 0;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                campus[i][j] = line.charAt(j);
                if(campus[i][j] == 'I'){
                    a = i;
                    b = j;
                }
            }
        }

        int friend = bfs(a, b);

        if(friend == 0){
            System.out.println("TT");
        }
        else{
            System.out.println(friend);
        }
    }

    static int bfs(int a, int b){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b});
        visited[a][b] = true;

        int count = 0;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny]){
                    if(campus[nx][ny] != 'X'){
                        visited[nx][ny] = true;
                        if(campus[nx][ny] == 'P'){
                            count++;
                        }
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return count;
    }
}
