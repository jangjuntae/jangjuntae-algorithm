import java.io.*;
import java.util.*;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        int[] result = new int[n];
        result[n - 1] = -1;

        for(int i = n - 2; i >= 0; i--) {
            if(arr[i + 1] == arr[i]) {
                result[i] = result[i + 1];
            }
            else {
                result[i] = i + 2;
            }
        }

        for(int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb);
    }
}
