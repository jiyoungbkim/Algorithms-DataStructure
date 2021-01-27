package programmers.Practice.Java.Level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
// 두 개 뽑아서 더하기
// TreeSet
public class p68644 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                // 리스트에 포함되어있지 않으면 추가
                if(i != j && list.contains(numbers[i]+numbers[j])) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    } 
    // TreeSet은 중복제거, 정렬을 해준다. 
    public int[] solution2(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    } 
}