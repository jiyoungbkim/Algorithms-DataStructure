package programmers.Practice.Java.Level_2;
// 피보나치 수
// fibonacci
public class p12945 {
    public int solution(int n) {
        int fn1 = 0, fn2 = 1;
        int tmp = 0;
        for(int i = 0; i < n-1; i++){
            tmp = fn1;
            fn1 = fn2;
            fn2 = tmp + fn2;
            // 44번째부터 피보나치는 int의 범위를 넘기 때문에 int범위 내에서 연산
            // 각 연산을 수행할 때마다 나눈 나머지는 마지막에 나눈 나머지와 같다
            fn2 %= 1234567;
        }
        //return fn2 % 1234567; 
        return fn2;
    }
}
