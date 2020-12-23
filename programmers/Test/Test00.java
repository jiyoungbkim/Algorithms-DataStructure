package programmers.Test;

public class Test00 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
            }
        }
        String str = "abcdef";
        if(str.contains("a")) {
		    System.out.println("true");
        }
    }
}
