package programmers.Practice.Java.Level_1;

import java.util.Arrays;

public class p12950 {
    public static void main(String[] args) {
        // int[][] A = { { 1, 2 }, { 2, 3 } };
        // int[][] B = { { 1, 2 }, { 2, 3 } };

        // System.out.println(Arrays.deepToString(solution(A, B)));
        System.out.println(Arrays.deepToString(solution(new int[][] {{ 1, 2 },{ 2, 3 }}, new int[][]{{ 1, 2 },{ 2, 3 }})));
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length] ;
            for(int k = 0; k < arr1.length; k++ ){
                for(int j = 0; j < arr1[0].length; j++){
                    answer[k][j] = arr1[k][j] + arr2[k][j];
                }   
            }      
        return answer;
    }
      
}
