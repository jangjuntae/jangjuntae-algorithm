import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        stack = new Stack<>();

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int[] tmp = new int[arr[i]];

            for(int j = 0; j < arr[i]; j++){
                tmp[j] = stack.pop();
            }

            stack.push(i+1);

            for(int j = arr[i] - 1; j >= 0; j--){
                stack.push(tmp[j]);
            }
        }

        for(int num : stack){
            System.out.print(num + " ");
        }
    }
}
