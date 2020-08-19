package AlgorithmsforPrograming.recursion;

public class Recursion09printChars {
    public static void main(String[] args) {
        printChars("print");
        printCharsReverse("reverse");
        System.out.println();
    }
    public static void printChars(String str) {
        if(str.length()==0) {
            //return;
            System.out.println();
        }
        else {
            System.out.print(str.charAt(0));// 문자열의 첫 글자를 프린트
            printChars(str.substring(1)); // 첫 글자를 제외한 나머지 글자
        }        
    }
    public static void printCharsReverse(String str) {
        if(str.length()==0)
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}