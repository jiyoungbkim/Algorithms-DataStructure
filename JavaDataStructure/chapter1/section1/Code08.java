package JavaDataStructure.chapter1.section1;

import java.util.Scanner;

public class Code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] data = new int[n];
        for(int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        int max = data[0];
        for(int i = 0; i < n; i++){
            sum += data[i];
            if(max < data[i]) {
                max = data[i];
            }
        }
        System.out.println("The sum is" + sum);
        System.out.println("The maximum is" + max);
    }
}
