import java.io.*;
import java.util.*;

public class Main {
    static long n;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());
        arr = new long[21];
        arr[0] = 1;

        for(int i = 1; i <= 20; i++){
            arr[i] += arr[i-1] * i;
        }

        if(n == 0){
            System.out.println("NO");
            System.exit(0);
        }

        boolean result = dfs(0, 0);

        if(result){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean dfs(int depth, long sum){
        if(depth == 20){
            if(sum == n) return true;
            else return false;
        }
        if (sum > n) {
            return false;
        }

        if(sum == n){
            return true;
        }

        if(dfs(depth + 1, sum + arr[depth])) {
            return true;
        }

        if(dfs(depth + 1, sum)){
            return true;
        }

        return false;
    }
}
