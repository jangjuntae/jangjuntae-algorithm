import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(dfs(0));
    }

    static int dfs(int day){
        if(day >= N){
            return 0;
        }

        int price = dfs(day + 1);

        if(day + arr[day][0] <= N){
            price = Math.max(price, arr[day][1] + dfs(day + arr[day][0]));
        }

        return price;
    }
}
