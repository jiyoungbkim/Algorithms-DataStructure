package programmers.Test;

import java.util.Arrays;

public class e20201219_3 {
    public static void main(String[] args)  {
        
        int[] s1 = {1,2,3,0,6,5,4};
        int[] s2 = {1,2,3,4,5,6,0};
        int answer = 0;
        int n = s1.length;
        int index1, index2;
            
        for(int i = 0; i < n; i++){
            if(s1[i]!= s2[i]){ 
                if(s1[i] == 0) {
                    index1 = indexS(s1, s2[i]);
                    s1[i] = s1[index1];
                    s1[index1] = 0;
                    answer++;
                } else {
                    index2 = indexS(s1, 0);
                    s1[index2]=s1[i];
                    s1[i]=0;
                    answer++;
                }              
            }
        }  
        System.out.println(answer);
        System.out.println(Arrays.toString(s1));       
    }
    static int indexS(int[] arr, int n){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]== n) {
                index = i;
                break;
            }
        }
        return index;
    }
}
