package JavaDataStructure.chapter1;

import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i]=sc.nextInt();
        }
        sc.close();

        int maxSum = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += data[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }    
}