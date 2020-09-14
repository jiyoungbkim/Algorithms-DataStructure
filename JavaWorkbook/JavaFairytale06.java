package JavaWorkbook;

import java.util.Scanner;

public class JavaFairytale06 {
    static String isPrince(String frogs[]) {
        for(int i = 0; i < frogs.length; i++) {
            if(frogs[i].charAt(0) == 'F') return frogs[i];
        }
        return null;
    }
    
	public static void main(String args[]) {
        int frogCount;
        String frogs[];
        int i;
        try(Scanner scan = new Scanner(System.in)){
    
            frogCount = Integer.parseInt(scan.nextLine());
            frogs = new String[frogCount];
        
            for(i = 0; i < frogCount; i++)
            {
                frogs[i] = scan.nextLine();
                
            }
            System.out.println(isPrince(frogs));   
        }
	}
}
