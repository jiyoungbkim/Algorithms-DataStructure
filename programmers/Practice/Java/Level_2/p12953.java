package programmers.Practice.Java.Level_2;
// N개의 최소공배수
// nlcm
public class p12953 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,6,8,14}));
    }
    public static int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    public static int lcm(int a, int b){        
        int multi = a * b;
        int gcd = a;
        while(b > 0){
            int tmp = b;
            b = gcd % b;
            gcd = tmp;
        }
        return multi / gcd;
    }
}