import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(st.nextToken(), 0);
        }

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()) {
                String word = st.nextToken();
                map.put(word, map.get(word) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1) != map.get(o2)) {
                    return map.get(o2) - map.get(o1);
                }
                return o1.compareTo(o2);
            }
        });

        for(String key : list) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
