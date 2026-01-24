import java.io.*;
import java.util.*;

public class Main {
    static int a;
    static int t;
    static int chant;
    static int result = 0;
    static int bun = 0;
    static int daegi = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());
        t = Integer.parseInt(br.readLine());
        chant = Integer.parseInt(br.readLine());
        int count = 2;

        while(true){
            bun++;
            check(bun, 0);
            daegi++;
            check(daegi, 1);
            bun++;
            check(bun, 0);
            daegi++;
            check(daegi, 1);

            for(int i = 0; i < count; i++){
                bun++;
                check(bun, 0);
            }

            for(int i = 0; i < count; i++){
                daegi++;
                check(daegi, 1);
            }

            count++;
        }
    }

    public static void check(int k, int type){
        if(chant == 0){
            if(k == t && type == 0){
                System.out.println(result);
                System.exit(0);
            }
        }
        else if(chant == 1){
            if(k == t && type == 1){
                System.out.println(result);
                System.exit(0);
            }
        }
        result++;
        if(result == a){
            result = 0;
        }
    }
}
