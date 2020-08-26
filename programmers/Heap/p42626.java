package programmers.Heap;

import java.util.PriorityQueue;

public class p42626 {
    public static void main(String[] args) {
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        int result = solution(scoville, K);
        System.out.println(result);
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int scov : scoville){
            heap.offer(scov);
        }
        while(heap.peek() <= K){
            if(heap.size() == 1){
                return -1;
            }
            int s1 = heap.poll();
            int s2 = heap.poll();

            int mix = s1 + (s2 * 2);
            heap.offer(mix);
            answer++;
        }
        return answer;
    }
}