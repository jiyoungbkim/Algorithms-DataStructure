package programmers.Practice.Java.Level_1;
// 소수 찾기
// numberOfPrime
public class p12921 {
    public int solution(int n) {
        int answer = 0;
        for(int x = 2; x <= n; x++){
            boolean isPrime = true;
            for (int i = 2; i*i <= x && isPrime; i++){
                if(x % i == 0)
                    isPrime = false;
            }
            if(isPrime) answer++;              
        }
        return answer;
    }
}