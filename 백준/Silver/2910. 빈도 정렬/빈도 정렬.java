import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get((o2)) - map.get((o1)));

        for (int num : list) {
            int cnt = map.get(num);
            for (int j = 0; j < cnt; j++) {
                System.out.print(num + " ");
            }
        }
    }
}
