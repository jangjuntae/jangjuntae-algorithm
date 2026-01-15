import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tmp;
        Deque<int[]> deque = new ArrayDeque<>();
        String result = "";

        // 이게 번호가 중복이 있을 수 있으니 값을 활용하여 index를 찾지말고
        // index와 함꼐 배열로 저장 배열로 저장할 때는 생성하고 초기화까지
        for(int i = 0; i < n; i++) {
            tmp = sc.nextInt();
            deque.offer(new int[] {tmp, i+1});
        }

        while(!deque.isEmpty()) {
            int[] arr = deque.removeFirst();
            int num = arr[0];
            int index = arr[1];

            System.out.print(index + " ");

            if(deque.isEmpty()) {
                break;
            }

            if(num < 0){
                for(int i = 0; i < Math.abs(num); i++){
                    deque.addFirst(deque.removeLast());
                }
            }
            else{
                for(int i = 0; i < num - 1; i++){
                    deque.addLast(deque.removeFirst());
                }
            }
        }
    }
}
