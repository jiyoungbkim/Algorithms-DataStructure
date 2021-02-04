package programmers.Practice.Java.Level_2;
// 숫자의 표현
// expressions
public class p12924 {
    public int solution(int n) {
        int answer = 1;      
        // 절반까지 계산하면 된다  
        for(int i = 1; i < n/2+1; i++) {
            int sum = 0;
            int j = i;
            while(sum <= n){
                sum += j++;
                if(sum == n) answer++;
            }                                           
        }
        return answer;
    }
    // 정수론 정리
    // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다
    public int solution2(int n) {
        int answer = 0;       
        for(int i = 1; i <= n; i+=2) {
            if(n % i == 0) answer++;                                      
        }
        return answer;
    }
}