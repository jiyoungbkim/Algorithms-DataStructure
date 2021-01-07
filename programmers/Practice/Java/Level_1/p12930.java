package programmers.Practice.Java.Level_1;
// 이상한 문자 만들기
// toWeirdCase
public class p12930 {

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int j = 0;
        for(int i = 0; i < arr.length; i++){            
            if(arr[i].equals(" ")){
                answer += " ";
                j = 0;
            } else {
                if(j % 2 == 0) {
                    answer += arr[i].toUpperCase();
                } else {
                    answer += arr[i].toLowerCase();
                }
                j++;
            }                        
        }
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        for(String str : arr){
            cnt = str.equals(" ") ? 0 : cnt + 1;
            answer += cnt % 2 != 0 ? str.toUpperCase() : str.toLowerCase();
        }        
        return answer;
    }
}
