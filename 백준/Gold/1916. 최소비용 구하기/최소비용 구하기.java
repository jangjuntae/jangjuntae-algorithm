import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int distance;

    public Node(int end, int distance){
        this.end = end;
        this.distance = distance;
    }

    @Override
    public int compareTo(Node o){
        return this.distance - o.distance;
    }
}

public class Main {
    static final int INF = 100000000;
    static ArrayList<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }

        dist = new int[n + 1];
        Arrays.fill(dist, INF);

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
        }

        st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Node(start, 0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            int index = current.end;
            int distance = current.distance;

            if(distance > dist[index]){
                continue;
            }

            for(Node next : list[index]){
                if(dist[next.end] > dist[index] + next.distance){
                    dist[next.end] = dist[index] + next.distance;
                    pq.add(new Node(next.end, dist[next.end]));
                }
            }
        }

        System.out.println(dist[end]);
    }
}
