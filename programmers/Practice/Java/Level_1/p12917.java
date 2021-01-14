package programmers.Practice.Java.Level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// 문자열 내림차순으로 배치하기
// Str reverseSort
public class p12917 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        for(String str: arr){
            answer += str;
        }
        return answer;
    }
    // h
    public String solution2(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }
    // l
    public String solution3(String s) {
        return Stream.of(s.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}