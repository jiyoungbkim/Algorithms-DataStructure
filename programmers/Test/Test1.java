package programmers.Test;

public class Test1 {
    public static void main(String[] args) {
        
        int num = 713;
        int result = 0;
        while(num != 0) {
            result += num % 10; // 10으로 나눈 나머지
            num -= num % 10; // 원래의 값에서 빼기
            num /= 10; // 자릿수 줄이기
        }
        System.out.println(result);
    }
}