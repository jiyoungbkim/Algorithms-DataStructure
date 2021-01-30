package programmers.Practice.Java.Level_2;
// 행렬의 곱셈
// productMatrix
public class p12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int y1 = 0; y1 < arr1.length; y1++){
            for(int x2 = 0; x2 < arr2[0].length; x2++){
                for(int x1 = 0; x1 < arr1[0].length; x1++){
                    answer[y1][x2] += arr1[y1][x1] * arr2[x1][x2];
                }
            }
        }
        return answer;
    }
}