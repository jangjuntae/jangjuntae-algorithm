import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String str;

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            HashMap<String, Integer> HM= new HashMap<>();
            int result = 1;

            for(int j = 0; j < n; j++){
                sc.next();
                str = sc.next();
                HM.put(str, HM.getOrDefault(str, 0) + 1);
            }

            for(int var : HM.values()){
                result *= var + 1;
            }

            System.out.println(result - 1);
        }
    }
}
