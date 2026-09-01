public class Array1 {

    public static int largestElement(int arr[]) {
        if (arr.length <= 0) {
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void secondlarget(int arr[]) {
        if (arr.length <= 0) {
            System.out.println("empty arrya");
            return;
        }
        int max = arr[0];
        int secmax = -1;
        int min = arr[0];
        int secmin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
            if (arr[i] < secmin && arr[i] != min) {
                secmin = arr[i];
            }

        }
        System.out.println(" second larget  : " + secmax);
        System.out.println(" second minimum  : " + secmin);
        return;
    }

    public static void secondlarget2(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] > secmax && arr[i] != max) {
                secmax = arr[i];
            }
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] < secmin && arr[i] != min) {
                secmin = arr[i];
            }
        }

        System.out.println("second larget : " + secmax);
        System.out.println("second minimum : " + secmin);
    }

    public static boolean isSorted(int nums[]) {
        if (nums.length == 1) {
            return true;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedRotated(int nums[]) {
        if (nums.length == 1) {
            return true;
        }
        int rotate = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                rotate = i;
                break;
            }
        }

        for (int i = rotate + 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }

        for (int i = 0; i < rotate; i++) {
            if (i == 0) {
                if (nums[nums.length - 1] > nums[i]) {
                    return false;
                }
            } else {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int removeDuplicates(int[] nums){
        // nums = [0,1,2,3,4,2,2,3,3,4];

        if(nums.length <= 1){
            return 1;
        }

        int i = 0;
        int j = 0;

        while (i < nums.length) {
            if(nums[i] == nums[j]){
                i++;
            }else if(i-j == 1){
                j++;
            }else{
                j++;
                nums[j] = nums[i];
                i++;
            }
        }
        return j+1;
    } 

    public static void main(String[] args) {
        int arr[] = { 8, 10, 5, 7, 9, 22 };
        // System.out.println(largestElement(arr));
        //secondlarget2(arr);
        System.out.println(isSortedRotated(arr));

    }
}
