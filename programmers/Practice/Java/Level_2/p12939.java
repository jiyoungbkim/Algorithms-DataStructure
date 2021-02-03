package programmers.Practice.Java.Level_2;

import java.util.Arrays;
// 최댓값과 최솟값
// getMinMaxString
public class p12939 {
    public static void main(String[] args) {
        System.out.println(solution(" 1  2 "));
    }
    // 정렬 이용
    public static String solution(String s) {
        // 앞 뒤 공백 제거 strip(), 정규식으로 1칸이상의 공백 자르기 \\s+
        //String[] arr = s.strip().split("\\s+");
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);
        String answer = intArr[0]+" "+intArr[intArr.length-1];
        return answer;
    }
    // 반복문 이용
    public static String solution2(String s) {
        String[] arr = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i++){
            n = Integer.parseInt(arr[i]);
            if(min > n) min = n;
            if(max < n) max = n; 
        }
        String answer = min+" "+max;
        return answer;
    }
}