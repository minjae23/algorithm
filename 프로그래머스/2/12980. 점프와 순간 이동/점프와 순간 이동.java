import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n!=0){
            if(n%2==0){
                n=n/2;
            }
            else if(n%2!=0){
                n--;
                ans++;
            }
        }

        return ans;
    }
}

//해결법 : n%2 , n/2 사용
//        6%2 = 0 이면 6/2 나눈 몫 3
//        3%2 != 0 이니까 나머지 만큼 빼 -1
//        2%2 = 0이면 2/2 몫 1
//        1%2 != 0 나머지 빼 -1 -> 건전지 사용량
//그게 0 이면 종료
