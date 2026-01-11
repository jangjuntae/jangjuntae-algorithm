import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8001];

        int n = sc.nextInt();

        int [] arr_2 = new int[n];

        double sum = 0;

        for(int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr_2[i] = tmp;
            sum += tmp;

            arr[tmp + 4000]++;
        }

        Arrays.sort(arr_2);

        int max = 0;
        int index = -1;
        int cnt = 0;

        for(int i = 0; i < 8001; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        for(int i = 0; i < 8001; i++){
            if(max == arr[i]){
                cnt++;
                index = i;
                if(cnt == 2){
                    break;
                }
            }
        }

        System.out.println(Math.round(sum/n));
        System.out.println(arr_2[n/2]);
        System.out.println(index - 4000);
        System.out.println(arr_2[n-1] - arr_2[0]);
    }
}
