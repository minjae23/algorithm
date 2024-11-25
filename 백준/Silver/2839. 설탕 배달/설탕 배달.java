import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(sugar_delivery(N));
    }

    public static int sugar_delivery(int N) {
        
        int maxFiveKgBags = N / 5;

        
        for (int i = maxFiveKgBags; i >= 0; i--) {
            int remainingSugar = N - (i * 5);
            if (remainingSugar % 3 == 0) {
                return i + (remainingSugar / 3); 
            }
        }

        return -1; 
    }
}
