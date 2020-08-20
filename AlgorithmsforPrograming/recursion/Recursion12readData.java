package AlgorithmsforPrograming.recursion;

import java.util.Scanner;

public class Recursion12readData {
    public static void main(String[] args) {
        int n = 3;
        int [] data = new int [n];
        Scanner sc = new Scanner(System.in);
        readFrom(n, data, sc);
        sc.close();       
    }
    public static void readFrom(int n, int [] data, Scanner in) {
        if(n==0)
            return;
        else {
            readFrom(n-1, data, in);
            data[n-1] = in.nextInt();
            System.out.println(data[n-1]);
        }
    }
}