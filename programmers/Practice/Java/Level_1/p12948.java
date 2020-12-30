package programmers.Practice.Java.Level_1;

public class p12948 {
    public static void main(String[] args) {      
        solution("01033334444");
    }

    public static String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        for(int i = 0; i < len-4; i++){            
            answer += "*";
        }
        answer += phone_number.substring(len-4,len);
        return answer;
    }

    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length-4; i++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
