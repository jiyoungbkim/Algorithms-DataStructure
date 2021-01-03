package programmers.Practice.Java.Level_1;
// 정수 제곱근 판별
// square root
public class p12934 {
    public static void main(String[] args) {
        System.out.println(solution2(121));
    }

    public static long solution(long n) {

        double h = Math.sqrt(n);
        return (long) ((h % 1 == 0) ? Math.pow(h+1, 2) : -1);
    }

    public static long solution2(long n) {

        double h = Math.sqrt(n);
        if((int)h == h) return (long)Math.pow(h+1, 2);
        else return -1;
    }
}
