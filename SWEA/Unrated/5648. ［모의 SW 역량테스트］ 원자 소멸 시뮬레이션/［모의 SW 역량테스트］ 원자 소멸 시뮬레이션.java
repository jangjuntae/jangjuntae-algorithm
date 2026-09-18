import java.io.*;
import java.util.*;

public class Solution {
    static final int SIZE = 4001;

    static int[][] map = new int[SIZE][SIZE];

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    static class Unit {
        int x;
        int y;
        int dir;
        int energy;

        Unit(int x, int y, int dir, int energy) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.energy = energy;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int atomCount = Integer.parseInt(br.readLine());

            ArrayDeque<Unit> queue = new ArrayDeque<>();

            for (int i = 0; i < atomCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int x = (Integer.parseInt(st.nextToken()) + 1000) * 2;
                int y = (Integer.parseInt(st.nextToken()) + 1000) * 2;

                int dir = Integer.parseInt(st.nextToken());
                int energy = Integer.parseInt(st.nextToken());

                Unit atom = new Unit(x, y, dir, energy);

                map[y][x] = energy;
                queue.offer(atom);
            }

            int totalEnergy = 0;

            while (!queue.isEmpty()) {
                Unit current = queue.poll();
                
                if (map[current.y][current.x] != current.energy) {
                    totalEnergy += map[current.y][current.x];

                    map[current.y][current.x] = 0;

                    continue;
                }

                map[current.y][current.x] = 0;

                int nx = current.x + dx[current.dir];
                int ny = current.y + dy[current.dir];

                if (nx >= 0 && nx < SIZE &&
                    ny >= 0 && ny < SIZE) {

                    current.x = nx;
                    current.y = ny;

                    map[ny][nx] += current.energy;

                    queue.offer(current);
                }
            }

            System.out.println("#" + tc + " " + totalEnergy);
        }
    }
}