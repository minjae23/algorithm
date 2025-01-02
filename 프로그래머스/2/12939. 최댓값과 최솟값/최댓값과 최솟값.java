import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        String[] str = s.split(" ");

        int[] num = new int[str.length];
        for(int i = 0;i<str.length;i++){
            num[i]= Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        answer.append(num[0]);
        answer.append(" ");
        answer.append(num[str.length-1]);

        return answer.toString();
    }
}