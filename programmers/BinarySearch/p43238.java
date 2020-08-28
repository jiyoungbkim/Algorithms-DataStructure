package programmers.BinarySearch;

public class p43238 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7,10};
        p43238 s = new p43238();
        long result = s.solution(n, times);
        System.out.println(result);
    }

    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 0;
        long end = Long.MAX_VALUE / 2;

        while (start <= end) {
            long mid = (start + end) / 2;
            long people = n;
            for(int time : times) {
                people -= (long) mid / time;
            if (people < 0) break;                
            }
            if (people > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}