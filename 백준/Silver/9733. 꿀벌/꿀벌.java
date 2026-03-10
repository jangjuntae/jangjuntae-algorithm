import java.io.*;
import java.util.*;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line;
        int total = 0;

        HashMap<String, Integer> map = new HashMap<>();
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                map.put(word, map.getOrDefault(word, 0) + 1);
                total++;
            }
        }

        StringBuilder sb = new StringBuilder();

        String[] words = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};

          for (String word : words) {
              int count = map.getOrDefault(word, 0);
              double ratio = (double) count / total;

              sb.append(String.format("%s %d %.2f\n", word, count, ratio));
          }

          sb.append(String.format("Total %d 1.00", total));

        System.out.println(sb);
    }
}
