import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String key;
        String value;
        HashSet<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            key = st.nextToken();
            value = st.nextToken();

            if(set.contains(key) || set.contains(value)) {
                set.add(key);
                set.add(value);
            }
        }
        System.out.println(set.size());
    }
}
