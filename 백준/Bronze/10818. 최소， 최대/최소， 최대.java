import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int [] A = new int[N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            A[i] = in.nextInt();
            if(A[i]<min) min = A[i];
            if(A[i]>max) max = A[i];
        }

        System.out.println(min+" "+max);
    }
}
