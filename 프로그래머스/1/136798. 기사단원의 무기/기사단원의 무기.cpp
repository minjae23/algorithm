#include <string>
#include <vector>
#include <cmath>
using namespace std;

int solution(int number, int limit, int power) {
    int answer = 0;
   
    vector<int>v;
    for (int num = 1; num <= number; num++)
    {
        int count = 0;
        float sqrtNum = sqrt(num);
        for (int i = 1; i <=sqrtNum; i++)
        {
            if (num % i == 0) {
                count++;
                if (i != sqrtNum) {
                    count++;
                }
            }
        }
        v.push_back(count);
    }
    for (const auto& a : v)
    {
        if (a <= limit)
        {
            answer += a;
        }
        else if (a > limit)
        {
            answer += power;
        }
    }
    return answer;
}