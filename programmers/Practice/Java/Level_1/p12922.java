package programmers.Practice.Java.Level_1;
// 수박수박수박수박수박수?
// watermelon
public class p12922 {
    public static void main(String[] args) {
        System.out.println(solution3(5));
    }
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            answer += (i%2 == 0)? "수":"박";
        }
        return answer;
    }
    // 반복문 횟수 줄이기
    public String solution2(int n) {
        String answer = "";
        String subak = "수박";
        for(int i = 0; i < n/2; i++){
            answer += subak;
        }
        // 홀수인 경우는 수로 끝나야하기 때문에 더해준다.
        if(n%2 != 0) answer += "수";       
        return answer;
    }
    // 빈 char배열은 \0으로 먼저 생성
    // n이 5이라면, new char[3]으로 {'\0','\0','\0'}
    // 그것을 스트링으로 다시 생성해서 replace하면 "수박수박수박"이 되고 
    // substring을 이용해서 n으로 자른다.
    public static String solution3(int n) {
        return new String(new char[n/2+1]).replace("\0", "수박").substring(0, n);
    }
}
