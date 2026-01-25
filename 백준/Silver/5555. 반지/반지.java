import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = br.readLine();
            arr[i] += arr[i];
        }

        for(int i = 0; i < n; i++) {
            if(arr[i].contains(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
