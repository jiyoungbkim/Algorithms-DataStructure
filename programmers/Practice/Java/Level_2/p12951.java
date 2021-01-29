package programmers.Practice.Java.Level_2;
// JadenCase 문자열 만들기
// JadenCase
public class p12951 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int cnt = 0;
        for(String str : arr){
            cnt = str.equals(" ") ? 0 : cnt + 1;
            answer += cnt == 1 ? str.toUpperCase() : str.toLowerCase();
        }
        return answer;
    }
    public String solution2(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;
        for(String str : arr){
            answer += flag ? str.toUpperCase() : str; 
            flag = str.equals(" ") ? true : false;
        }
        return answer;
    }
}