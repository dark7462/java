class merge_sort{
    public static void main(String arg[]){
        int arr[] = {32,56,72,23,41,98,39,28,19,43,1,99}; 

        print(arr);
        mergeSort(arr,0,(arr.length-1));
        print(arr);

    }
    public static void mergeSort(int arr[],int start, int end){
        if(start == end) return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr,mid+1, end);

        merge(arr, start, mid ,end);
    }
    public static void merge(int arr[], int start,int mid, int end){

        int s1 = start, e1 = mid, s2 = mid+1, e2 = end;
        int B[] = new int[end-start+1];

        int i = s1, j = s2, k = 0;
        while(i <= e1 && j <= e2){
            if(arr[i] <= arr[j]){
                B[k++] = arr[i++];
            }else{
                B[k++] = arr[j++];
            }
        }
        while(i <= e1){
            B[k++] = arr[i++];
        }
        while(j <= e2){
            B[k++] = arr[j++];
        }

        k = 0;
        for(i = start; i <= end; i++){
            arr[i] = B[k++];
        }
    }
    public static void print(int arr[]){
        for(int i : arr)System.out.print(i +" ");
        System.out.println();
    }
}