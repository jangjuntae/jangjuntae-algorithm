import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        int[] dp = new int[k + 1];

        Arrays.fill(dp, 1000001);

        dp[0] = 0;

        for(int i = 0; i < list.size(); i++){
            for(int j = list.get(i); j <= k; j++){
                dp[j] = Math.min(dp[j], dp[j - list.get(i)] + 1);
            }
        }

        if(dp[k] == 1000001){
            System.out.println("-1");
        }
        else{
            System.out.println(dp[k]);
        }
    }
}
