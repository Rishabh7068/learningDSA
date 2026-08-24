//we will solve 22 patterns problem
public class pattern {

    public static void pattern1(){
    int n = 5;
    for(int i=0; i<n+1 ; i++){
        for(int j = 0 ; j < n; j++ ){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void pattern2(){
        int n =5;
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(){
        int n =5;

        for(int i =0 ; i<5 ; i++){
            for(int j=1; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(){
        int n = 5;
        
        for(int i = 0 ; i < n ; i++){
            int k = i+1;
            for(int j = 1 ; j <= i+1 ; j++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void pattern5(){
        int n = 5 ;

        for(int i = 0 ; i < n; i++){
            for(int j = n-i ; j> 0 ; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(){
        int n =5;

        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(){
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            // print space
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            // print start 
            int temp = i*2+1;
            for (int k = 0; k < temp ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(){
        int n =5;

        for (int i = 0; i < n; i++) {
            // space 

            for(int j = n-i ; j < n ; j++ ){
                System.out.print(" ");
            }

            int temp = (n-i)*2-1;
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            // star
            System.out.println();
            
        }
    }

    public static void pattern9(){
        int n =5;

        for (int i = 0 ; i < n*2 ; i++ ){
           // upper 

           if(i<5){
            //space
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            //star
            int temp = (i*2)+1;
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
           }else{
           //lower
            //space
            for (int j = n; j < i ; j++) {
                System.out.print(" ");
            }
            //star
            int temp = ((n*2-i)*2)-1;
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
            }

        }
    }

    public static void pattern10(){
        int n = 5;

        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0 ; i < n-1 ; i++){
            for (int j = n-1; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
        //pattern6();
        //pattern7();
        //pattern8();
        //pattern9();
        pattern10();

    }
}
