package programmers.StackQueue;

import java.util.Stack;

public class p42584 {
    public static void main(String[] args) {
        int[] prices = new int[] {1, 2, 3, 2, 3};
        p42584 s = new p42584();
        int[] result = s.solution(prices);
        for(int sec : result ) {
            System.out.println(sec);
        }        
    }
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> stack = new Stack<>();

        for(int i = prices.length -2; i >= 0; i--){
            if(prices[i] > prices[i+1]){
                answer[i] = 1;
                stack.push(new int[] { prices[i+1], i+1});
            } else {
                while(stack.size() > 0 && stack.peek()[0] >= prices[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    answer[i] = prices.length - i - 1;
                } else {
                    answer[i] = stack.peek()[1] - i;
                }
            }
        }
        return answer;
    }
}