package programmers.Practice.Java.Level_1;
// 자릿수 더하기
// sum_digit
public class p12931 {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }
    public static int solution(int n) {
        // Math.log10은 승수를 구해주는 함수
        // (int)형으로 변환해서 소수를 제거후 +1 하면 자릿수(100은 10^ 2 + 1 = 세자리)
        int length = (int)(Math.log10(n)+1);
        int answer = 0;
        for(int i = 0; i < length; i++){
            answer += n%10;            
            n = n/10;
        }
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        while(n != 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}