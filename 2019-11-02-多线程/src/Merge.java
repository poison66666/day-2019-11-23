public class Merge {
    int count;
    public  int count(int[] A,int n){
        count = 0;
        if(A != null){
            mergeSortUpDown(A,0,A.length-1);
        }
        return count;
    }

    private void mergeSortUpDown(int[] a, int start, int end) {
        if(start >= end){
            return;
        }
        int mid = (start+end)>>1;
        mergeSortUpDown(a,start,mid);
        mergeSortUpDown(a,mid+1,end);
        merge(a,start,mid,end);
    }

    private void merge(int[] a, int start, int mid, int end) {
        int[] tmp = new int[end-start+1];
        int i = start; int j = mid + 1; int k = 0;
        while (i <= mid && j <= end){
            if(a[i] <= a[j]){
                tmp[k++] = a[i++];
            }else{
                tmp[k++] = a[j++];
                count += mid - i + 1;
            }
        }
        while (i <= mid){
            tmp[k++] = a[i++];
        }
        while (j <= end){
            tmp[k++] = a[j++];
        }
        for( int x = 0;x < tmp.length;x++){
            a[start+x] = tmp[x];
        }
    }
    public static void main(String[] args) {
        Merge m = new Merge();
        int[] a = {1,2,3,4,5,6,7,0};
        int c = m.count(a,8);
        System.out.println(c);
    }
}
