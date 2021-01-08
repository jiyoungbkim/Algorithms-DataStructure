package programmers.Practice.Java.Level_1;
// 약수의 합
// sumDivisor
public class p12928 {
    public int solution(int n) {
        int answer = n;
        for(int i = 1; i < n/2 + 1; i++){
            if(n%i == 0){
                answer += i;
            }
        }
        return answer;
    }
}