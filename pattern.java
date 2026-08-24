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

        for(int i =0 ; i<n ; i++){
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

    public static void pattern11(){
     int n = 5;

     for (int i = 0; i < n; i++) {
        for (int k = 0; k < i+1; k++) {
            if((i+k)%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();   
     }
    }

    public static void pattern12(){
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j);
            }

            for (int k = 0; k < (n-i-1)*2; k++) {
                System.out.print(" ");
            }

            for (int l = i+1 ; l > 0; l--) {
                System.out.print(l);
            }
            System.out.println();
        }

    }

    public static void pattern13(){
        int n=5;
        int temp =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(temp);
                System.out.print(" ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void pattern14(){
        int n = 5;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(((char)(ch+j)));
            }
            System.out.println();
        }
    }

    public static void pattern15(){
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(((char)('A'+j)));
            }
            System.out.println();
        }
    }

    public static void pattern16(){
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(((char)('A'+i)));
            }
            System.out.println();
        }
    }

    public static void pattern17(){
        int n = 5;

        for(int i = 0 ; i < n ; i++ ){
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            int temp = -1;
            for (int j = 0; j < i*2+1; j++) {
                if(j < i+1){
                    temp++;
                    System.out.print((char)('A'+temp));
                }else{
                    temp--;
                    System.out.print((char)('A'+temp));
                }
            }
            System.out.println();
        }
    }

    public static void pattern18(){
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)(n-i+j+'A'-1));
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
        //pattern10();
        //pattern11();
        //pattern12();
        //pattern13();
        //pattern14();
        //pattern15();
        //pattern16();
        //pattern17();
        pattern18();

    }
}
