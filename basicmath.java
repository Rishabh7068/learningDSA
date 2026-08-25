import java.util.*;
public class basicmath {
    // Count digit in a number
    public static int countDigit(int n){
        int ans = 0;
        while(n  > 0){
            ans++;
            n =n/10;
        }
        return ans;
    }
    
    //Reverse digits of a number
    public static int reverseDigit(int n){
        int ans =0;

        while(n > 0){
            int temp = n%10;
            ans = ans*10+temp;
            n=n/10;
        }
        return ans;
    }

    //Check if a number is Palindrome or Not
    public static void isPalindrome(int n){
        int ans = reverseDigit(n);
        if(ans == n){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    //check if a number is Armstrong Number or not
    public static void isArmstrong(int n){
        int x = countDigit(n);
        int ans = 0;
        int temp =n;
        System.out.println(x);
        while (n > 0) {
            System.out.println((n%10)^x);
            ans = ans+ (int)Math.pow((double)(n%10),(double)x);
            n = n/10;
        }
        System.out.println(ans);
        if(temp == ans){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is Not Armstrong");
        }

    }

    //Print all Divisors of a given Number
    public static void allDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    //Prime Number
    public static void isPrime(int n){
        int f = 0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                f=1;
            }
        }
        if(f==0){
            System.out.println("prime number");
        }else{
            System.out.println("not prime number");
        }
    }

    public static int gcd(int n , int m){
        int ans = 1;

        for (int i = 2; i < Math.min(n, m); i++) {
            if(n%i == 0 && m%i ==0 ){
                ans = Math.max(ans, i);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println("Know Basic Math");
        int n = 20;
        int m = 15;
        //System.out.println(countDigit(n));
        //System.out.println(reverseDigit(n));
        //isPalindrome(n);
        //isArmstrong(n);
        //allDivisors(n);
        //isPrime(n);
        System.out.println(gcd(n, m));
        
    }
}
