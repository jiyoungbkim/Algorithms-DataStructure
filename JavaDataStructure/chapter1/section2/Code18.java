package JavaDataStructure.chapter1.section2;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] data = new int[n];
        for(int i = 0; i < n; i++){
            data[i]=sc.nextInt();
        }
        sc.close();
        bubbleSort(n, data);
        for(int x = 0; x < n; x++) {
            System.out.print(data[x]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int n, int[] data) {
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(data[j]>data[j+1]){
                    //swap(data[j], data[j+1]); // 값에 의한 호출
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
    // 값에 의한 호출이기 때문에 숫자가 바뀌더라도 배열에 반영되지 않음
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }    
}