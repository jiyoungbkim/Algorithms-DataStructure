package programmers.Practice.Java.Level_2;

public class p12911 {
    public static void main(String[] args) {
        System.out.println(solution(78));
    }

    public static int solution(int n) {
        String nTwo = Integer.toBinaryString(n);
        //char[] charArr = nTwo.toCharArray();
        System.out.println(nTwo);
        if(nTwo.contains("0")){
            for(int i = 1; i < nTwo.length(); i++){
                if(nTwo.charAt(i) == '1'){

                }
            }
        }
        int answer = 0;
        return answer;
    }
}
