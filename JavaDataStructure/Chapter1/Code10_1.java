package JavaDataStructure.chapter1;

public class Code10_1 {
    
    public static void main(String[] args) {
        int n = 10111;

        boolean isPrime = true; // 증거가 발견되기 전에는 소수로 추정
        for (int i = 2; i <= n/2; i++) { 
            if(n % i == 0) { // n이 소수가 아니라는 증거 찾기
                isPrime = false;
                break; // 더이상 검사할 필요가 없으므로
            } 
        }
        if(isPrime)
            System.out.println(n);
    }    
}