package programmers.Test;

import java.util.Arrays;

public class MonthlyCode01 {
    static int[] answer = new int[100];
    static int n = 0;
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        int[] result = solution(numbers);
        for(int x = 0; x < n; x++){
            System.out.print(result[x]+" "); 
        }              
    }

    public static int[] solution(int[] numbers) {
        
        int len = numbers.length;
        int sum = 0;
        Arrays.sort(numbers);
        for(int num : numbers){
            System.out.print(num+" ");
        }
        System.out.println();

        for(int i = 0; i < len; i++){
            for(int j = 0; j < i; j++){               
                sum = numbers[i]+numbers[j];
                boolean flag = findArray(len, sum);
                if(flag) {
                    answer[n] = sum;
                    n++;  
                }                                                        
            }
        }
        return answer;
    }

    static boolean findArray(int len, int sum) {
        for(int x = 0; x < len; x++){
            if(answer[x]==sum) 
                return false;            
        }
        return true;
    }
}
