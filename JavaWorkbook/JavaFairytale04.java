package JavaWorkbook;

import java.util.Scanner;

public class JavaFairytale04 {
    public static void main(String args[]) {
        /* 여기에 코드를 작성해 주세요 */
        Scanner sc = new Scanner(System.in);
              
        String str = sc.nextLine();
        String count[] = str.split(" ");
        for(int i = 0; i < count.length; i++) {
            for(int j =0; j < count[i].length(); j++){
                System.out.print("개굴");
            }
            System.out.print(" ");
        }
        System.out.println();              
        sc.close();
	}
}
