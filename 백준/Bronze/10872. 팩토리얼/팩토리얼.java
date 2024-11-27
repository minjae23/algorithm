import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(factorial(N));
    }
    public static int factorial(int x){
        int result = 1;

        if (x<=1){
            return 1;
        }
        for(int i =1 ; i<=x ; i++){
            result = result *i;
        }
        return result;
    }
}
