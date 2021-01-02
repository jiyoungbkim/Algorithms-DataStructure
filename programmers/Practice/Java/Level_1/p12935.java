package programmers.Practice.Java.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 제일 작은 수 제거하기
// remove small
public class p12935 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution4(new int[] { 4, 3, 2, 1, 5 })));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length > 1){
            // 배열에서 최소값 구하기
            int min = Arrays.stream(arr).min().getAsInt(); 

            // int 배열을 Integer 리스트로 변환하기
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            
            // 리스트에서 최소값 삭제
            // list.remove(list.indexOf(min));
            // int 값을 넣어주면 인덱스로 삭제하기 때문에 (Object)로 형변환
            list.remove((Object)min);

            // 리스트를 int 배열로 변환
            // answer = list.stream().mapToInt(i->i).toArray();
            answer = list.stream().mapToInt(Integer::intValue).toArray();

        } else {
            answer = new int[]{-1};
        }

        return answer;
    }
    // 리스트로 변환하지 않고 하는 방법
    public int[] solution2(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }

    public static int[] solution3(int[] arr) {
        int[] answer = {};
        if(arr.length > 1){
            // 배열에서 최소값 구하기
            int min = Arrays.stream(arr).sorted().findFirst().getAsInt();
            // 새로운 배열 선언
            answer = new int[arr.length-1];
            
            int cnt = 0; // 카운트 변수
            int i = 0; // 배열에서 값을 가져오기 위한 인덱스
            while (cnt < answer.length){
                if(arr[i] == min) {      
                    i++;
                    continue;
                }
                // 최소값이 아닐 경우에는 새로운 배열에 넣고 인덱스를 늘려준다.
                answer[cnt++] = arr[i++];                            
            }
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
    public static int[] solution4(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int[] answer = {};
        // 새로운 리스트 생성
        List<Integer> list = new ArrayList<Integer>();
        for (int i : arr)
        {
            list.add(i);
        }
        // 리스트에서 최소값 찾기
        Integer min = Collections.min(list);
        list.remove(min);
        // 새로운 배열을 생성해서 값넣기
        answer = new int[arr.length-1];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }   
        return answer;
    }
   
}