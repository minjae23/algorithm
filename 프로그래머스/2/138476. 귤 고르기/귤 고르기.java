import java.util.Arrays;
class Solution {
    public int solution(int k, int[] tangerine) {
        int maxSize = Arrays.stream(tangerine).max().getAsInt();
        int []dp =new int[maxSize+1];

        for(int i=0;i<tangerine.length;i++){
            dp[tangerine[i]]++;
        }
        Arrays.sort(dp);
        int answer = 0;
        for(int i=1;i<=dp.length;i++){
            k-=dp[dp.length-i];
            answer++;
            if(k<=0){
                break;
            }
        }

        return answer;
    }
}