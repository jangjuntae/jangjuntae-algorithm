import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));

        PriorityQueue<Long> pq = new PriorityQueue<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long tmp;
        long k, t;
        long result = 0;
        int Ex = 0;

        st = new StringTokenizer((br.readLine()));
        for(int i = 0; i < n; i++){
            tmp = Long.parseLong(st.nextToken());
            Ex += tmp;
            pq.add(tmp);
        }

        if(m == 0){
            System.out.println(Ex);
            System.exit(0);
        }

        while(m-- > 0){
            k = pq.poll();
            t = pq.poll();

            tmp = k + t;

            pq.add(tmp);
            pq.add(tmp);
        }

        while(!pq.isEmpty()){
            result += pq.poll();
        }

        System.out.println(result);
    }
}
