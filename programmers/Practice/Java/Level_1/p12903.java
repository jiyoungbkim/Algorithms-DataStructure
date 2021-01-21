package programmers.Practice.Java.Level_1;
// 가운데 글자 가져오기
// getMiddle
public class p12903 {
    public String solution(String s) {
        return s.substring((s.length()-1)/2,s.length()/2+1);
    }
    // 문자열이 없을 경우의 처리
    public String getMiddle(String word){
        return word != null ? word.substring((word.length()-1)/2,(word.length()+2)/2) : "";
    }
}