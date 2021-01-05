package programmers.Practice.Java.Level_1;
// 자연수 뒤집어 배열로 만들기
// digit_reverse
public class p12932 {
    public static void main(String[] args) {
        
    }
    public static int[] solution(long n) {        
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];
        int j = 0;
        for(int i= arr.length-1; i >= 0; i--){
            answer[j++] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
    // h
    public int[] solution2(long n) {        
        char[] arr = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i] - 48;
        }
        return answer;
    }
    // l
    public int[] solution3(long n) {       
        String a = ""+n; // String + 숫자 = String *Integer.toString과 같음
        int[] answer = new int[a.length()];
        for(int i = 0; i < a.length(); i++){
            answer[i] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}
