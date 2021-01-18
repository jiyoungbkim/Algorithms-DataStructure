package programmers.Practice.Java.Level_1;
// 두 정수 사이의 합
// adder a to b
public class p12912 {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i = Math.min(a,b); i <= Math.max(a,b); i++)
            answer += i;
        return answer;
    }
    // 등차수열의 합 공식
    public long solution2(int a, int b) {
        return (Math.abs((long)a-b)+1)*(a+b)/2;
    }
}