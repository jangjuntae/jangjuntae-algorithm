import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int [][] arr = new int[15][15];

        for(int i = 0; i < 15; i++){
            arr[0][i] = i + 1;
        }

        for(int i = 1; i < 15; i++){
            for(int j = 0; j < 15; j++){
                for(int l = 0; l <= j; l++){
                    arr[i][j] += arr[i-1][l];
                }
            }
        }

        for(int i = 0; i < t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(arr[k][n-1]);
        }
    }
}
