import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int N = in.nextInt();
        // 결과 출력
        int count =0;
        for(int i=0;i<N;i++){
            if(check()==true){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() {

        boolean[] checker = new boolean[26];
        char prev = 0;
        String word = in.next();

        for (int j = 0; j < word.length(); j++) {
            char temp = word.charAt(j);
            if (prev != temp) {
                if (checker[temp - 'a'] == false) {
                    checker[temp - 'a'] = true;
                    prev = temp;
                } else {
                    return false;
                }
            }

        }
        return true;
    }
}
