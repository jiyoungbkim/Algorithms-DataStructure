package programmers.Practice.Java.Level_1;
// 문자열 다루기 기본
// alpha_string46
public class p12918 {
    // h
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6) {
            answer = true;
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                if(!Character.isDigit(ch)){
                    answer = false;
                    break;
                }
            }
        }        
        return answer;
    }

    // 정규 표현식 
    public boolean solution2(String s) {
        // ^와 $는 문자열의 처음과 끝 [0-9]은 숫자인지 {4}|{6}는 길이가 4혹은 6인지
        return s.matches("^[0-9]{4}|{6}$");    
    }

    // 조건을 반대로 만족
    public boolean solution3(String s) {
        // 문자열 길이가 4나 6이 아니면 false or s를 숫자빼고 나눈 길이가 0보다 크면 false
        // 두가지 조건 중 하나라도 만족하면 false를 리턴. 둘 다 false여야 true를 리턴
        return (s.length() != 4 && s.length() != 6) || (s.split("[0-9]").length > 0) ? false:true;
    }

    public boolean solution4(String s) {
        if(s.length() == 4 || s.length() == 6){
            int x = -1;
            try{
                x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                System.out.println(x);
                return false;
            }
        }
        else return false;
    }
}