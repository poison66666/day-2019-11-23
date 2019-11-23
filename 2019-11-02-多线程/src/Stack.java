import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    public static boolean chkParenthesis(String A, int n) {
        ArrayList<Character> stack = new ArrayList<>();
        for(int i = 0; i<A.length();i++){
            char c = A.charAt(i);
            if(c >='a' && c <='z'){
                return false;
            }
            switch (c){
                case '(':
                case '[':
                case '{':
                    stack.add(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    char left = stack.remove(stack.size()-1);
                    if(!(left == '('&& c==')')||(left == '[' && c == ']') || (left == '{' && c =='}')) {
                        return false;
                    }
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(chkParenthesis(a,6));

    }
}
