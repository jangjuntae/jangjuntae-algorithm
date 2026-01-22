import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String str = br.readLine();
        int cnt = 0;

        for(int i = 0; i <= s.length() - str.length(); i++){
            if(s.substring(i, i + str.length()).equals(str)) {
                cnt++;
                i += str.length() - 1;
            }
        }
        System.out.println(cnt);
    }
}
