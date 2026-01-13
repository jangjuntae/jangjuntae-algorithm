import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char [][] arr = new char[n][n];
        int []head = new int[2];
        int left_arm = 0;
        int right_arm = 0;
        int left_leg = 0;
        int right_leg = 0;
        int waist = 0;

        for(int i = 0; i < n; i++) {
            String str = sc.next();
            for(int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        Loop1:
        for(int i = 0; i < n; i++) {
            Loop2:
            for(int j = 0; j < n; j++) {
                if(arr[i][j] == '*') {
                    head[0] = i + 2;
                    head[1] = j + 1;
                    i++;
                    j--;
                    while(arr[i][j] == '*'){
                        left_arm++;
                        j--;
                        if(j == -1){
                            break;
                        };
                    }
                    j = head[1] - 1;
                    j++;
                    while(arr[i][j] == '*'){
                        right_arm++;
                        j++;
                        if(j == n){
                            break;
                        };
                    }
                    j = head[1] - 1;
                    i++;
                    while(arr[i][j] == '*'){
                        waist++;
                        i++;
                    }
                    j--;
                    while(arr[i][j] == '*'){
                        left_leg++;
                        i++;
                        if(i == n){
                            break;
                        };
                    }
                    i -= left_leg;
                    j += 2;
                    while(arr[i][j] == '*'){
                        right_leg++;
                        i++;
                        if(i == n){
                            break;
                        };
                    }
                    break Loop1;
                }
            }
        }
        System.out.print(head[0]);
        System.out.print(" ");
        System.out.println(head[1]);
        System.out.print(left_arm);
        System.out.print(" ");
        System.out.print(right_arm);
        System.out.print(" ");
        System.out.print(waist);
        System.out.print(" ");
        System.out.print(left_leg);
        System.out.print(" ");
        System.out.print(right_leg);
    }
}
