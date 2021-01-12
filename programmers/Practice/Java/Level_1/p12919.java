package programmers.Practice.Java.Level_1;

import java.util.Arrays;
// 서울에서 김서방 찾기
// findIndex
public class p12919 {
    
    public String solution(String[] seoul) {
        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") +"에 있다";
    }

    public String solution2(String[] seoul) {
        int index = 0;
        for(int i=0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])) {
                index = i;
                break;
            }            
        }
        return "김서방은 "+index+"에 있다";
    }
}