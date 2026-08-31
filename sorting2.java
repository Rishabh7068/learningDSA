public class sorting2 {

    public static void mergeSort(int arr[] , int st , int en ){
        if(st >= en){
            return;
        }

        int mid = (en-st)/2+st;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, en);

        merge(arr, st , mid , en);

        return;
    }

    public static void merge(int arr[] , int st , int mid , int en){
        int temp[] = new int[en-st+1];
        int j =0;
        int k = st;
        int x = mid;

        while (st <= x && mid+1 <= en) {
            if(arr[st] <= arr[mid+1]){
                temp[j] = arr[st];
                st++;
            }else{
                temp[j] = arr[mid+1];
                mid++;
            }
            j++;
        }

        while (st<= x) {
            temp[j] = arr[st];
            st++;
            j++;
        }

        while (mid+1 <=en) {
            temp[j] = arr[mid+1];
            mid++;
            j++;
        }

        for (int i = 0; i < temp.length; i++) {
            arr[k] = temp[i];
            k++;
        }
        return;
    }

    public static void recursiveBubbleSort(int arr[] , int n ){
        if(n==1){
            return;
        }

        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp; 
            }
        }

        recursiveBubbleSort(arr, n-1);
    }

    public static void recursiveInsertionSort(int arr[] ,  int i , int n){
        if(i == n){
            return;
        }
        int j = i;

        while (j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveInsertionSort(arr, i+1, n);
        
    }

    public static void quicSort(int arr[] , int st , int en ){
        if(st > en){
            return;
        }
        
        int i = st;
        int j = st;

        while (i < en) {
            if(arr[i] <= arr[en] ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }

       
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


        quicSort(arr, st, j-1);
        quicSort(arr, j+1, en);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,1,3};
        quicSort(arr,0, arr.length-1);
        System.out.println("Sorrted Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }
    }   
}



