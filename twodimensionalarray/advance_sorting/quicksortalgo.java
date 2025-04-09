package advance_sorting;

public class quicksortalgo {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr,int lo,int hi){
    int pivot =arr[lo], pidx=lo;
    int smallercount=0;
    for(int i=lo+1;i<=hi;i++){
        if(arr[i]<=pivot) smallercount++;
    }
    int correctidx=pidx+smallercount;
   swap(arr,pidx,correctidx);
   int i=lo,j=hi;
   while(i<correctidx&&j>correctidx){
      if(arr[i]<=pivot) i++;
      else if(arr[j]>pivot) j--;
      else if(arr[i]>pivot && arr[j]<=pivot){
          swap(arr,i,j);
      }
   }
   return correctidx;
    }
    public static void quicksort(int[] arr,int lo,int hi){
       if(lo>=hi) return;
        int idx=  partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,2,3,6,5,8};
        int n=arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}
