package programmers.Practice.Java.Level_1;

import java.util.Arrays;
// 평균구하기
// getAverage
public class p12944 {
    public static void main(String[] args) {
        double result = solution2(new int[] { 1, 2, 3, 4 });
        System.out.println(result);
    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int x = 0; x < arr.length; x++){
            sum += arr[x];
        }
        answer = sum / arr.length;
        return answer;
    }

    public static double solution2(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        // int / int이기 때문에 소수점이하 버려짐
        return (double)sum / arr.length;
    }

    // stream API 사용
    public static double solution3(int[] arr) {       
        return Arrays.stream(arr).average().orElse(0);        
    }
}
