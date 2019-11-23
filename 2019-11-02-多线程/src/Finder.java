import java.util.*;

public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return quickSort(a,0,n-1,K);
    }

    private int quickSort(int[] a, int low, int high, int K) {
        int p = partion(a,low,high);
        if(K == p-low+1){
            return a[p];
        }else if(p-low+1>K){
            return quickSort(a,low,p-1,K);
        }else{
            return quickSort(a,p+1,high,K-(p-low+1));
        }
    }

    private int partion(int[] a, int low, int high) {
        int tmp = a[low];
        while (low < high){
            while (low <high && a[high] <= tmp){
                high--;
            }
            if (low == high){
                break;
            }else{
                a[low] = a[high];
            }
            while (low < high&&a[low]>=tmp){
                low++;
            }
            if(low == high){
                break;
            }else{
                a[high] = a[low];
            }
        }
        a[low] = tmp;
        return low;
    }
}
