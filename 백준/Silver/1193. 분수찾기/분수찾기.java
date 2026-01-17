import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int max = 1;
        int m = max;
        int k = 1;

        while(result < n - 1){
            result++;

            if(m == max && k == 1) {
                max++;
                m = 1;
                k = max;
                continue;
            }
            m++;
            k--;
        }

        if(max % 2 != 0){
            System.out.println(k + "/" + m);
        }
        else{
            System.out.println(m + "/" + k);
        }
    }
}
