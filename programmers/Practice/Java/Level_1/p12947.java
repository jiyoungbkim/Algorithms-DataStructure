package programmers.Practice.Java.Level_1;

public class p12947 {

    public static void main(String[] args) {
        System.out.println(solution2(10));
    }
    public static boolean solution(int x) {
        String[] arr = Integer.toString(x).split("");
        int sum = 0;
        for(int k = 0; k < arr.length; k++){
            sum += Integer.parseInt(arr[k]);
        }
        return x % sum == 0;
    }
    public static boolean solution2(int x) {
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String i : arr){
            sum += Integer.parseInt(i);
        }
        return x % sum == 0;
    }
    // 람다식 이용 sum 함수 사용시 전역변수로 설정
    static int sum = 0;
    public static boolean solution3(int x) {
        String.valueOf(x).chars().forEach(c -> sum += c - '0');
        return x % sum == 0;
    }
}
