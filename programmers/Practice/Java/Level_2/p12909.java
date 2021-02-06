package programmers.Practice.Java.Level_2;
// 올바른 괄호
// bracket
public class p12909 {
    boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '(') cnt++;
            else if(s.charAt(i) == ')') cnt--;
            if(cnt < 0) {
                break;
            }
        }
        if(cnt == 0) answer = true;
        return answer;
    }
}