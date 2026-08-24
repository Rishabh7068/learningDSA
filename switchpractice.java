public class switchpractice {

    public static int sumation(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int n = 5;

        switch (n) {
            case 1: System.out.print("i am 1"); 
                    break;
            case 2: System.out.println("i am 2");
                    break;
            case 3: System.out.println("i am 3");
                    break;
            default:System.out.println("i am no one"); 
                break;
        }

        for (int i = 0; i < 5; i++) {
            System.err.println(i);
        }

        while (n>0) {
            System.out.println("in while");
            n--;
        }
        int ans = sumation(10,29);
        System.out.println(ans);

    }
}
