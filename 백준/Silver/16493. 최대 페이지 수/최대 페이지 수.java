import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int result = Integer.MIN_VALUE;
    static int [][] book;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        book = new int[m][2];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            book[i][0] = Integer.parseInt(st.nextToken());
            book[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);

        System.out.println(result);
    }

    public static void dfs(int depth, int sum, int day){
        if(day > n){
            return;
        }

        if(depth == m){
            result = Math.max(result, sum);
            return;
        }

        dfs(depth+1, sum, day);
        dfs(depth+1, sum + book[depth][1], day + book[depth][0]);
    }
}
