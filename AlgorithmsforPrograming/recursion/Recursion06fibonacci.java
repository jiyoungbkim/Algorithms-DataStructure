package AlgorithmsforPrograming.recursion;

public class Recursion06fibonacci {
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i <= n; i++){
            System.out.println(fibonacci(i));
        }
    }
    public static int fibonacci(int n){
        if(n < 2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}