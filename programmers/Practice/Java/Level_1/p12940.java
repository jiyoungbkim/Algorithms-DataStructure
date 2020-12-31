package programmers.Practice.Java.Level_1;

import java.util.Arrays;

// 최대공약수와 최소공배수
// gcdLcm
public class p12940 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution2(2, 5)));
    }
    // 재귀함수
    public static int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;
        int[] answer = { gcd, lcm };
        return answer;
    }

    public static int gcd(int p, int q) {
        // if(q == 0)
        // return p;
        // else {
        // return gcd(q, p%q);
        // }
        return (q == 0) ? p : gcd(q, p % q);
    }

    // 유클리드 호제법
    public static int[] solution2(int n, int m) {
        int gcd = m;
        int multi = m*n;
        // int gcd, n;
        // if(n > m) {
        //     gcd = n;
        //     n = m;
        // } else {
        //     n = n;
        //     gcd = m;
        // }
        while (n > 0) {
            int tmp = n;
            n = gcd % n;
            gcd = tmp;
        }
        int[] answer = {gcd, multi/gcd};
        return answer;
    }
}
