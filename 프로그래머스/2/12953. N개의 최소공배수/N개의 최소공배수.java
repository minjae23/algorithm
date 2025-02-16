
class Solution {
    public int GCD(int a,int b){
        int r= a%b;
        if(r==0)return b;
        else{
            return GCD(b,r);
        }
    }
    public int solution(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            arr[i+1]=arr[i]*arr[i+1]/GCD(arr[i],arr[i+1]);
        }
        int answer = arr[arr.length-1];
        return answer;
    }
}


