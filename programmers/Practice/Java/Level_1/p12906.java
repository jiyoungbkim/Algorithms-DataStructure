package programmers.Practice.Java.Level_1;

import java.util.ArrayList;
// 같은 숫자는 싫어
// no_continuous Num
public class p12906 {
    public int[] solution(int []arr) {        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        return answer;
    }

    public int[] solution2(int []arr) {  
        ArrayList<Integer> list = new ArrayList<>();      
        int preNum = 10;
        for(int num : arr){
            if(preNum != num) list.add(num);
            preNum = num;
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            //answer[i] = list.get(i).intValue();
            answer[i] = list.get(i);
        }
        return answer;
    }
}