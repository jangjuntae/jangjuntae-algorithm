import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String reverse_str = "";

        for(int i = str.length() - 1; i >= 0; i--){
            reverse_str += str.charAt(i);
        }

        if(str.equals(reverse_str)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
