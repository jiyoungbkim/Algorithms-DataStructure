package programmers.Practice.Java;
// 문자열 내 p와 y의 개수
// numPY
public class p12916 {
    boolean solution(String s) {
        String[] arr = s.toLowerCase().split("");
        int p = 0, y = 0;
        for(String str : arr){
            if(str.equals("p")) p++;
            else if(str.equals("y")) y++;
        }       
        return p == y;
    }
    // h
    // count 한개만 이용한 방법
    boolean solution2(String s) {
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') count++;
            else if(s.charAt(i) == 'y') count--;
        }       
        return count == 0;
    }
    // 람다식
    boolean solution3(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
        //return s.chars().filter( e -> 'P'== e|'p'== e).count() == s.chars().filter( e -> 'Y'== e|'y'== e).count();
    }
}