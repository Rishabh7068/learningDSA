public class basicRecursion {

    public static void printHello(int n){
        if(n < 1){
            return;
        }
        printHello(n-1);
        System.out.print("Hello ");
    }

    public static void printNumber(int n){
        if(n < 1){
            return;
        }
        printNumber(n-1);
        System.out.print(n+" ");
    }

    public static void printRevNumber(int n){
        if(n < 1){
            return;
        }
        System.out.print(n+" ");
        printRevNumber(n-1);
    }

    public static int sumOfNumber(int n){
        if(n < 2){
            return 0+n;
        }
        return n+sumOfNumber(n-1);
    }

    public static int fac(int n){
        if(n == 1){
            return 1;
        }
        return n*fac(n-1);
    }

    public static void reverseArray(int n[] , int x){
        //swap
        if(n.length/2 >= x){
            return;
        }
        //cal start idx
        int st = n.length -x;
        int en = x-1;
        int temp = n[st];
        n[st] = n[en];
        n[en] = temp;

        reverseArray(n, x-1);
    }

    public static boolean isPalindromeString(String str){
        if(str.length() == 0 || str.length()==1){
            return true;
        }

        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        }
        str = str.substring(1,str.length()-1);
        isPalindromeString(str);
        return true;
    }

    public static int fib(int n){
        if(n==1 || n==0){
            return n;
        }
        int ans =fib(n-1)+fib(n-2);
        return ans;
    }


    public static void main(String[] args) {
        //printHello(5);
        //printNumber(5);
        //printRevNumber(5);
        //System.out.println(sumOfNumber(5));
        //System.out.println(fac(5));
        // int arr[] = {1,2,3,4,5};
        // reverseArray(arr, 5);
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        //System.out.println(isPalindromeString("ABCDCBA"));
        // int n =5;
        // for (int i = 0; i < n; i++) {
        //     System.out.println(fib(i)+" ");
        // }
    }
}
