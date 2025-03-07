import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = in.nextInt();
        }

        Arrays.sort(A); 
        Arrays.sort(B); 

        for (int i = 0; i < N / 2; i++) {
            int temp = B[i];
            B[i] = B[N - 1 - i];
            B[N - 1 - i] = temp;
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }
}
