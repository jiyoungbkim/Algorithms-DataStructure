package programmers.Practice.Java.Level_1;

import java.util.Arrays;
// 예산
// budget
public class p12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for(int i : d){
            budget -= i;
            if(budget < 0) break;
            answer++;
        }
        return answer;
    }
}