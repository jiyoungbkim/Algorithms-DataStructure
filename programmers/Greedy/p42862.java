package programmers.Greedy;

public class p42862 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        p42862 s = new p42862();
        int result = s.solution(n, lost, reserve);
        System.out.println(result);

    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n];
        for(int i : lost) students[i-1]--;
        for(int i : reserve) students[i-1]++;

        for(int i = 0; i < n; i++){
            if(students[i] == -1){
                if(students[i-1] == 1) {
                    students[i-1]--;
                    students[i]++;                   
                } else if(students[i+1] == 1) {
                    students[i+1]--;
                    students[i]++;
                }
            }
            if(students[i] != -1){
                answer++;
            }
        }
        return answer;
    }
}