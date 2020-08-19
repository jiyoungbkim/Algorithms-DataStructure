package AlgorithmsforPrograming.recursion;

public class Recursion11arraySum {
    public static void main(String[] args) {
        int n = 3;
        int [] data = new int [] {2, 14, 37};
        int result = sum(n, data);
        System.out.println(result);
    }
    public static int sum(int n, int [] data) {
        if(n<=0)
            return 0;
        else {
            return sum(n-1, data) + data[n-1];
        }        
    }
}