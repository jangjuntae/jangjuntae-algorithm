import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int cost;

    public Node(int end, int cost){
        this.end = end;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o){
        return this.cost - o.cost;
    }
}

public class Main {
    static final int INF = 100000000;
    static ArrayList<Node>[] list;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];

        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }

        dist = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++){
            Arrays.fill(dist[i], INF);
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
        }

        for(int i = 1; i <= n; i++){
            PriorityQueue<Node> pq = new PriorityQueue<>();
            dist[i][i] = 0;
            pq.add(new Node(i, 0));

            while (!pq.isEmpty()) {
                Node current = pq.poll();
                int index = current.end;
                int cost = current.cost;

                if(dist[i][index] > cost){
                    continue;
                }

                for(Node next : list[index]){
                    if(dist[i][next.end] > dist[i][index] + next.cost){
                        dist[i][next.end] = dist[i][index] + next.cost;
                        pq.add(new Node(next.end, dist[i][index] + next.cost));
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(dist[i][j] == INF){
                    sb.append("0").append(" ");
                }
                else{
                    sb.append(dist[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
