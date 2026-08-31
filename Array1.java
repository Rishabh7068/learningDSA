public class Array1 {

    public static int largestElement(int arr[]){
        if(arr.length <= 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void secondlarget(int arr[]){
        if(arr.length <= 0){
            System.out.println("empty arrya");
            return ;
        }
        int max = arr[0];
        int secmax = -1;
        int min = arr[0];
        int secmin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
            if(arr[i] < secmin && arr[i] != min){
                secmin = arr[i];
            }

        }
        System.out.println( " second larget  : " + secmax);
        System.out.println( " second minimum  : " + secmin);
        return ;
    }

    public static void main(String[] args) {
        int arr[] = {8, 10, 5, 7, 9,22};
        //System.out.println(largestElement(arr));
        secondlarget(arr);

    }
}
