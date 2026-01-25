import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static LinkedList<Integer> list;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        list = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        dfs(0);
        System.out.println(max);
    }

    public static void dfs(int sum){
        if(list.size() == 2){
            max = Math.max(max, sum);
            return;
        }

        for(int i = 1; i < list.size() - 1; i++){
            int energy = list.get(i - 1) * list.get(i + 1);

            int record = list.get(i);
            list.remove(i);
            dfs(sum + energy);

            list.add(i, record);
        }
    }
}
