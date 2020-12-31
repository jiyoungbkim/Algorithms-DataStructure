package programmers.Practice.Java.Level_1;
// 콜라츠 추측
// collatz
public class p12943 {
    public int solution(int num) {
        long n = (long)num;
        for(int i = 0; i < 500; i++){
            if(n == 1) return i;
            if(n % 2 == 0) n /= 2;
            else n = n*3+1;
        }  
        return -1;
    }

    // 삼항 연산자 사용
    public int solution2(int num) {
        long n = (long)num;
        for(int i = 0; i < 500; i++){
            if(n == 1) return i;
            n = (n % 2 == 0) ?  n/2 : n*3+1;
        }  
        return -1;
    }
}
