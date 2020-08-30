package JavaDataStructure.chapter1;

import java.util.Scanner;

public class Code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i] = sc.nextInt();
        }
        sc.close();

        int maxPrime = 0;
        for(int i = 0; i < n; i++){            
            for(int j = i; j < n; j++){
                int val = 0;
                for(int k = i; k <= j; k++) {
                    val = val * 10 + data[k];
                }
                boolean isPrime = true;
                for(int p = 2; p*p <= val && isPrime; p++){
                    if(val % p == 0) isPrime = false;
                }
                if(isPrime && val > 1 && val > maxPrime){
                    maxPrime = val;
                }
            }            
        }
        if(maxPrime > 0) {
            System.out.println(maxPrime);  
        } else {
            System.out.println("No Prime Number");
        }             
    }
}