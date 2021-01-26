package programmers.Practice.Java.Level_1;
// 3진법 뒤집기
// ternary
public class p68935 {
    public static void main(String[] args) {
        System.out.println(solution2(45));
    }
    public int solution(int n) {        
        String str = "";
        while(n > 0){
            str +=""+n%3;
            n = n/3;
        }       
        int answer = 0;
        int l = str.length()-1;
        System.out.print(l);
        for(int i = 0; i <= l; i++){
            answer += (str.charAt(i) - '0') * Math.pow(3,l-i);
        }
        return answer;
    }
    // h
    public static int solution2(int n) {
        int answer = 0;
        String third = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(third);
        String reversed = sb.reverse().toString();
        
        int exp = 0;
        for(int i = reversed.length()-1; i >= 0; i--){
            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3,exp);
            exp++;
        }
        return answer;
    }
}