import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int result = N / 4;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}
