import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Stack<Character> stack = new Stack<Character>();
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                if(str.charAt(i-1) == '('){
                    stack.pop();
                    result += stack.size();
                }
                else{
                    result += 1;
                    stack.pop();
                }
            }
        }
        System.out.println(result);
    }
}
