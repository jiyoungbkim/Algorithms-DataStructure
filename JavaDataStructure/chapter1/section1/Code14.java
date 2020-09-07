package JavaDataStructure.chapter1.section1;

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 정수를 정렬하시겠습니까? : ");
        int n = sc.nextInt();
        int[] data = new int[n];

        System.out.print(n+"개의 정수를 입력하세요. : ");
        for(int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        sc.close();

        // bubble sort
        for(int i = n-1; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                if(data[j]>data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for(int x = 0; x < n; x++){
            System.out.print(data[x]+" ");
        }       
    }    
}