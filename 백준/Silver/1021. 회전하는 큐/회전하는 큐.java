import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> queue = new LinkedList<Integer>();
        int []arr = new int[m];

        int count = 0;

        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        for (int i = 0; i < m; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            int index = queue.indexOf(arr[i]);
            int mid_index;

            if(queue.size() % 2 == 0){
                mid_index = queue.size() / 2 - 1;
            }
            else{
                mid_index = queue.size() / 2;
            }

            if(index <= mid_index){
                for(int j = 0; j < index; j++){
                    int tmp = queue.pollFirst();
                    queue.offerLast(tmp);
                    count++;
                }
            }
            else{
                for(int j = 0; j < queue.size() - index; j++){
                    int tmp = queue.pollLast();
                    queue.offerFirst(tmp);
                    count++;
                }
            }
            queue.pollFirst();
        }
        System.out.println(count);
    }
}
