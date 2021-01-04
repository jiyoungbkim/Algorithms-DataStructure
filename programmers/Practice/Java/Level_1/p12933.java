package programmers.Practice.Java.Level_1;

import java.util.Arrays;
import java.util.Collections;
// 정수 내림차순으로 배치하기
// reverseInt
public class p12933 {
    public static void main(String[] args) {
        System.out.println(solution2(118372));
    }
    public static long solution(long n) {

        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String result = "";
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }        
        return Long.parseLong(result);
    }
    // 람다식 이용
    static String result = "";
    public static long solution2(long n) {
                
        String.valueOf(n).chars().sorted().forEach(c -> result = Character.valueOf((char)c) + result); 
        return Long.parseLong(result);
    }
}