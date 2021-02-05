package programmers.Practice.Java.Level_2;

public class p12913 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
    public static int solution(int[][] land) {
        int col = 5;
        int col2 = 0;       
        int answer = 0;
        for(int i = 0; i < land.length; i++){    
            int max = land[i][0];
            int cnt = 0;     
            while(cnt < land[i].length){
                if(cnt != col && max < land[i][cnt]) {
                    max = land[i][cnt];
                    col2 = cnt;
                }
                cnt++;
            }
            col = col2;
            answer += max;
        }
        return answer;
    }
}
