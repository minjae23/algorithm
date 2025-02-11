class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        char[] arr_s = s.toCharArray();
        int i =0;
        for(char c : arr_s){
            if(i>0&&c==arr_s[i-1]){
                i--;
            }
            else{
                arr_s[i]=c;
                i++;
            }
        }
        //i가 0이면 다 삭제 된거 아니면 삭제 안됬으므로 0 반환
        return i==0 ? 1:0;

    }
}