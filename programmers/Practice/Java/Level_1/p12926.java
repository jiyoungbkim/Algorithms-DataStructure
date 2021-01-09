package programmers.Practice.Java.Level_1;
// 시저 암호
// caesar
public class p12926 {
    public static void main(String[] args) {
        System.out.println(solution("AaZz",25));
    }
    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        int bit = 0;
        for (char c : arr){
            if(c == ' ') answer += " ";
            else {
                bit = c + n;
                if(c >= 'a' && c <= 'z'){
                    if(bit > 'z'){
                        bit -= 26;
                    }
                } else {
                    if(bit > 'Z'){
                        bit -= 26;
                    }
                }
                answer += (char)bit;
            }            
        }
        return answer;
    }
    
    public static String solution2(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = (char)((ch - 'A' + n) % 26 + 'A');
            } else if(Character.isLowerCase(ch)){
                ch = (char)((ch - 'a' + n) % 26 + 'a');
            }
            answer += ch;
        }
        return answer;
    }    
}