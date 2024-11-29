import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

       int N = in.nextInt();
       int M = in.nextInt();

       int [][]A = new int[N][M];
       int [][]B = new int[N][M];
       int [][]sum = new int[N][M];

       for(int i=0;i<N;i++){
           for(int j=0;j<M;j++){
               A[i][j] = in.nextInt();
           }
       }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                B[i][j] = in.nextInt();
                sum[i][j] = B[i][j]+ A[i][j];
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }



    }

}
