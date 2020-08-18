package JavaDataStructure.chapter1;

public class Code10_0 {
    public static void main(String[] args) {
        int n = 2;

        if(isPrime(n) == true) {
            System.out.println(n+"은 소수입니다.");
        } else {
            System.out.println(n+"은 소수가 아닙니다.");
        }              
    }
    public static boolean isPrime(int n){
        for(int i = 2; i*i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}