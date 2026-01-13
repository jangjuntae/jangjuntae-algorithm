import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, String> hm = new HashMap<String, String>(n);
        HashMap<String, String> hm2 = new HashMap<String, String>(n);

        for(int i = 1; i <= n; i++){
            str = sc.next();
            hm.put(str, i+"");
            hm2.put(i+"", str);
        }

        for(int i = 1; i <= m; i++){
            str = sc.next();

            if(hm.containsKey(str)){
                System.out.println(hm.get(str));
            }
            else{
                System.out.println(hm2.get(str));
            }
        }
    }
}
