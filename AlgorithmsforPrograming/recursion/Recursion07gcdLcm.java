package AlgorithmsforPrograming.recursion;

public class Recursion07gcdLcm {
    public static void main(String[] args) {
        int m = 15;
        int n = 12;
        int gcd = gcdSimple(m, n);
        int lcm = m*n/gcd;
        System.out.println("최대공약수 : " + gcd);
        System.out.println("최소공배수 : " + lcm);
    }
    public static int gcd(int m, int n) {
        if (m<n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if(m%n == 0)
            return n;
        else
            return gcd(n, m%n);        
    }   
    public static int gcdSimple(int p, int q) {
        if(q==0)
            return p;
        else
            return gcdSimple(q, p%q); 
    }
}