package AlgorithmsforPrograming.recursion;

public class Recursion05powerofN {
    public static void main(String[] args) {
        int result = power(2,3);
        System.out.println(result);
    }
    public static int power(int x, int n) {
        if(n == 0)
            return 1;
        else
            return x * power(x, n-1);
    }
}