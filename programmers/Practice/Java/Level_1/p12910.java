package programmers.Practice.Java.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// 나누어 떨어지는 숫자 배열
// divisible
public class p12910 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }
        if(list.size() == 0) list.add(-1);
        else Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    // stream 이용
    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}