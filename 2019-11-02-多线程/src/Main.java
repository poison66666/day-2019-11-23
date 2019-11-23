import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int count = 0;
        String result = "";
        for(int i = 0;i < a.length;i++){
            if(a[i] >='0' && a[i]<='9'){
                count=1;
                int index = i;
               for(int j = i + 1;j <a.length;j++){
                   if(a[j] >= '0' && a[j] <='9'){
                       count++;
                       index = j;
                   }else{
                       break;
                   }
               }
               if(count > result.length()){
                   result = str.substring(i,index+1);
               }
            }else{
                continue;
            }
        }
        System.out.println(result);
    }
}