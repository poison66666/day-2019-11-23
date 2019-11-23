import java.util.Scanner;

public class Find {
    public int FindKth(int[] a,int n, int K){
        return findKth(a,0,n-1,K);
    }

    private int findKth(int[] a, int low, int high, int K) {
        int path = partition(a,low,high);
        if(K == path-low+1){
            return a[path];
        }else if(K > path-low+1){
            return findKth(a,path+1,high,K-path+low-1);
        }else{
            return findKth(a,low,path-1,K);
        }
    }

    private int partition(int[] a, int low, int high) {
        int key = a[low];
        while (low < high){
            while (low < high && a[high] < key){
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] > key){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public static void main(String[] args) {
        Find f = new Find();
        int[] a = {5,8,9,6,7,1,3,4,2};
        System.out.println(f.FindKth(a,9,9));
    }
}
