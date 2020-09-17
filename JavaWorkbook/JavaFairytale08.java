package JavaWorkbook;

import java.util.Scanner;

public class JavaFairytale08 {
    public static void main(String args[]) {
        int starDistance;
        Scanner scan = new Scanner(System.in);
        
        starDistance = scan.nextInt();
        
        scan.close();
        /* 여기에 코드를 작성해 주세요 */
        int star = 0;        
        while(star < 5){
            System.out.print("*");
            star++;
            if(star < 3) {
                for(int i = 0; i < starDistance; i ++){
                    System.out.print(" ");
                }
            }            
            if(star == 3) {
                System.out.println();
                for(int g = 0; g < starDistance/2 + 1; g++){
                    System.out.print(" ");
                }                    
            }
            if(star > 3){
                if(starDistance%2 != 0){                
                    for(int i = 0; i < starDistance; i++){                    
                        System.out.print(" ");
                    }                                                  
                } 
                if(starDistance%2 == 0) {
                    for(int i = 0; i < starDistance-1; i++){                    
                        System.out.print(" ");
                    }
                } 
            }                     
        }
	}
}
