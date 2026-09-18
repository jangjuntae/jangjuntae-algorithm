import java.io.*;
import java.util.*;

public class Solution {
    static int[] dy = {0, -1, 0, 1};
    static int[] dx = {1, 0, -1, 0};
    static int[][] map = new int[100][100];
    
    static class Node{
        int y, x;
        
        public Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }
    
    static boolean check(int y, int x){
        if(y < 0 || y >= 100 || x < 0 || x >= 100){
            return false;
        }
        return true;
    }
    
    static int bfs(int startY, int startX, int endY, int endX){
        ArrayDeque<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[100][100];
        visited[startY][startX] = true;
        queue.offer(new Node(startY, startX));
        
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            int y = cur.y;
            int x = cur.x;
            
            if(map[y][x] == 3){
                return 1;
            }
            
            for(int d = 0; d < 4; d++){
                int ny = y + dy[d];
                int nx = x + dx[d];
                
                if(check(ny, nx) && !visited[ny][nx] && map[ny][nx] != 1){
                    visited[ny][nx] = true;
                    queue.offer(new Node(ny, nx));
                }
            }
        }
        
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int tc = 1; tc <= 10; tc++){
            int t = Integer.parseInt(br.readLine());
            
            int startX = 0;
            int startY = 0;
            int endX = 0;
            int endY = 0;
            
            for(int i = 0; i < 100; i++){
                String str = br.readLine();
                for(int j = 0; j < 100; j++){
                    map[i][j] = str.charAt(j) -'0';
                    
                    if(map[i][j] == 2){
                        startY = i;
                        startX = j;
                    }
                    
                    if(map[i][j] == 3){
                        endY = i;
                        endX = j;
                    }
                }
            }
            
            int answer = bfs(startY, startX, endY, endX);
            
            System.out.println("#" + t + " " + answer);
        }
    }
}
