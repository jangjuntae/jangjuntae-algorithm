import java.io.*;
import java.util.*;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr_1 = new int[a];
        int[] arr_2 = new int[b];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a; i++){
            arr_1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < b; i++){
            arr_2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        int k = 0;
        int answer = 0;
        int i, j;

        if(n % 2 != 0){
            answer += arr_1[a - 1];
            i = a - 2;
            j = b - 1;
            n--;
        }
        else{
            i = a - 1;
            j = b - 1;
        }

        while(n > 0){
            int sum = 0;
            int B = 0;

            if(i >= 1){
                sum = arr_1[i] + arr_1[i - 1];
            }

            if(j >= 0){
                B = arr_2[j];
            }

            if(sum > B){
                answer += sum;
                i -= 2;
            }
            else{
                answer += B;
                j--;
            }

            n -= 2;
        }

        System.out.println(answer);
    }
}
