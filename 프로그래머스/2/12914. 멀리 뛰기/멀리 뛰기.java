class Wrong_Solution {

    public static long factorial(int n){
        long result =1;
        for(int i=2;i<=n;i++){
            result *=i;
        }
        return result;
    }
    public static long uniquePermutations(int total, int count1, int count2) {
        return factorial(total) / (factorial(count1) * factorial(count2));
    }


    public long solution(int n) {
        long answer = 0;
        // i는 2칸 점프(2)의 개수
        for (int i = 0; i <= n / 2; i++) {
            int ones = n - (2 * i); // 1칸 점프(1)의 개수
            int twos = i;           // 2칸 점프(2)의 개수
            answer += uniquePermutations(ones + twos, ones, twos);
        }

        return answer % 1234567;

    }
}

class Solution {
    public long solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return dp[n];
    }
}

// 피보나치수