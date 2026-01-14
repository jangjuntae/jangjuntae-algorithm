import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '<'){
                while(str.charAt(i) != '>'){
                    System.out.print(str.charAt(i));
                    i++;
                }
                System.out.print(str.charAt(i));
            }
            else if (str.charAt(i) == ' '){
                System.out.print(str.charAt(i));
                ArrayList<Object> list = new ArrayList<>();
                i++;
                while(i < str.length() && str.charAt(i) != ' ' && str.charAt(i) != '<'){
                    list.add(str.charAt(i));
                    i++;
                }
                for(int j = list.size() - 1; j >= 0; j--){
                    System.out.print(list.get(j));
                }
                i--;
            }
            else{
                ArrayList<Object> list = new ArrayList<>();
                while(i < str.length() && str.charAt(i) != ' ' && str.charAt(i) != '<'){
                    list.add(str.charAt(i));
                    i++;
                }
                for(int j = list.size() - 1; j >= 0; j--){
                    System.out.print(list.get(j));
                }
                i--;
            }
        }
    }
}
