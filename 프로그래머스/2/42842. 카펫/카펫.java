import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        List<Integer>answer = new ArrayList<>();
        int sum = brown + yellow;


        for(int h =1;h*h<=yellow;h++){
            if(yellow%h ==0){
                int w = yellow/h;
                if((h+2)*(w+2)==sum){
                    answer.add(w+2);
                    answer.add(h+2);
                }
            }

        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
//해결법 : brown + yellow 의 값 = (w+2)*(h+2) =48
//yellow의 약수를 h 약수로 나눈 몫을 w
//