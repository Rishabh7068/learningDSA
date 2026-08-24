import java.util.Scanner;

public class ifelese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==5){
            System.out.println("i am 5");
        }else if (n == 10) {
            System.out.println("i am 10");
        }else{
            System.out.println("i am not 5 or 10");
        }
        sc.close();
    }   
}
