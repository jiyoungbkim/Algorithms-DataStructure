package programmers.Practice.Java.Level_1;
// 문자열을 정수로 바꾸기
// strToInt
public class p12925 {
    public int solution(String s) {
        int answer = 0;
        Boolean sign = true;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '-') sign = false;
            else if(ch != '+'){
                answer = answer * 10 + (ch - '0'); 
            }
        }
        return answer *= sign ? 1 : -1;
    }
}