package JavaDataStructure.chapter2;

import java.util.Scanner;

public class Code16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = power(a, b);
        System.out.println(result);

        sc.close();
    }
    public static int power(int a, int b) {
        int prod = 1;
        for(int i = 0; i < b; i++)
            prod *= a;
        return prod;
    }
}