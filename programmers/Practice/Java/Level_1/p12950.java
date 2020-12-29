package programmers.Practice.Java.Level_1;

public class p12950 {
    class Solution {
        public int[][] solution(int[][] arr1, int[][] arr2) {
            int[][] answer = new int[arr1.length][arr1[0].length] ;
            for(int k = 0; k < arr1.length; k++ ){
             for(int j = 0; j < arr1[0].length; j++){
                 answer[k][j] = arr1[k][j] + arr2[k][j];
             }   
            }      
            return answer;
        }
      }
}
