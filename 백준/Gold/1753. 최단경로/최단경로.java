import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int end;
    int weight;

    public Node(int end, int wuight){
        this.end = end;
        this.weight = wuight;
    }

    @Override
    public int compareTo(Node o){
        return this.weight - o.weight;
    }
}

public class Main {
    static final int INF = 100000000;
    static ArrayList<Node>[] list;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());

        list = new ArrayList[v + 1];

        for(int i = 1; i <= v; i++){
            list[i] = new ArrayList<>();
        }

        dist = new int[v + 1];
        Arrays.fill(dist, INF);

        for(int i = 0; i < e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list[a].add(new Node(b, c));
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while(!pq.isEmpty()){
            Node current = pq.poll();
            int index = current.end;
            int weight = current.weight;

            if(weight > dist[index]){
                continue;
            }

            for(Node next : list[index]){
                if(dist[next.end] > dist[index] + next.weight){
                    dist[next.end] = dist[index] + next.weight;
                    pq.add(new Node(next.end, dist[next.end]));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= v; i++) {
            if (dist[i] == INF) {
                sb.append("INF\n");
            }
            else {
                sb.append(dist[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
