import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] blood = new int[n];
        int [] happy = new int[n];
        int [] dp = new int[101];

        for(int i = 0; i < n; i++) {
            blood[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            happy[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = 99; j >= blood[i]; j-- ){
                dp[j] = Math.max(dp[j], dp[j-blood[i]] + happy[i]);
            }
        }

        System.out.println(dp[99]);
    }
}
