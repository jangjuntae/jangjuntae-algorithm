import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][] arr = new int[n][5];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int [][] result = new int[n][10];

        for(int t = 0; t < n; t++) {
            int m = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    for (int k = j + 1; k < 5; k++) {
                        result[t][m] = (arr[t][i] + arr[t][j] + arr[t][k]) % 10;
                        m++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            Arrays.sort(result[i]);
        }

        int index = 1;
        int max = result[0][9];
        for(int i = 1; i < n; i++){
            if(max <= result[i][9]){
                max = result[i][9];
                index = i + 1;
            }
        }

        System.out.println(index);
    }
}
