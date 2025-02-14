import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int start= 0;
        int end = people.length-1;
        int answer = 0;
        while(start <=end){
            if(start == end){
                answer++;
                break;
            }
            else if(people[start]+people[end]<=limit){
                answer++;
                end--;
                start++;
            }
            else{
                end--;
                answer++;
            }

        }

        return answer;
    }
}
//최대 두명 .  보트 무게제한이 넘어가면 1명씩 구출
//보트의 무게제한은 사람이 몸무게가 넘을 수없음
// 그렇다면 정렬을한뒤 가장무거운 사람과 가장 가벼운 사람을 연결 해서 빼내는것이 베스트
// 무거운 사람에서 -- , 가벼운 사람에서++ 해서 짝을 지어 내보내고
// end값이 start값과 같아지거나 작으면 종료 리턴