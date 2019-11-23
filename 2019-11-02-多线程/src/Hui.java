import java.util.Scanner;

public class Hui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        for(int i = 0;i<a.length();i++){
            StringBuilder sb = new StringBuilder(a);
            sb.insert(i,b);
            if(isHuiWen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isHuiWen(String s) {
        int a = 0;
        int b = s.length()-1;
        while (a < b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
