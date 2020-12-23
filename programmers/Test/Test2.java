package programmers.Test;

public class Test2 {
    public static void main(String[] args) {
        int answer = 0;
        int num = 8;
        int[] cards = {1,4,6};
        int len = cards.length;
        for(int i = len-1; i >= 0; i--){
            answer += num/cards[i];
            num %= cards[i];            
        }
        
        System.out.println(answer);
    }
}