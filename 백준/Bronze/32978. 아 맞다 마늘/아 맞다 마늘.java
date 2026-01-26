import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<String> food = new LinkedList<>();
        LinkedList<String> noFood = new LinkedList<>();

        for(int i = 0; i  < n; i++){
            food.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i  < n - 1; i++){
            noFood.add(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            if(!noFood.contains(food.get(i))){
                System.out.println(food.get(i));
                break;
            }
        }
    }
}
