public class sorting1 {

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minidx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }

    public static void bubleSort(int arr[]){
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(int arr[]){
        int i =0;
        int j =1;
        while(j < arr.length){
            int key = arr[j];
            i = j-1;
            while (i >=0 && arr[i] > key) {
                 arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
            j++;
        }
    }


    public static void main(String[] args) {
        int arr[] = {6,23,4,8,9};
        //selectionSort(arr);
        //bubleSort(arr);
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");   
        }
    }
}
