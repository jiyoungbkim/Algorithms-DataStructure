package programmers.Practice.Java.Level_1;
// 내적
// inner product
public class p70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }
}