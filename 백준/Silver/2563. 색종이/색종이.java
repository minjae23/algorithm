import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static Scanner in = new Scanner(System.in);
    static int sum =0;
    static boolean [][]background  = new boolean[100][100];
    public static void main(String[] args) {
        int Num_paper = in.nextInt();


        for(int i =0;i<Num_paper;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            check(x,y);
        }
        System.out.println(sum);

    }
    public static int check(int x,int y){
            for(int i=x;i<10+x;i++){
                for(int j=y;j<10+y;j++){
                    if(!background[i][j]){
                        background[i][j]=true;
                        sum++;
                    }
                }
            }
        return sum;
    }

}
