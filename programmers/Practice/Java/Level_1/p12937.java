package programmers.Practice.Java.Level_1;
// 짝수와 홀수
// EvenOdd
public class p12937 {
    public String solution(int num) {
        String answer = "";
        answer = (num % 2 == 0) ? "Even":"Odd";
        return answer;
    }
    public String solution2(int num) {
        // 메서드가 String이라서 따로 선언하지 않아도 된다.
        return (num % 2 == 0) ? "Even":"Odd";
    }
}
