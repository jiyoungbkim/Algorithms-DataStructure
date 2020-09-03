package JavaDataStructure.chapter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {
    static int n;
    static int[][] grid;

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("JavaDataStructure/chapter2/grid.txt"));
           
            n = inFile.nextInt();
            grid = new int [n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    grid[i][j] = inFile.nextInt(); 
                }
            }            
            inFile.close();
            for(int x = 0; x < n; x++){
                for(int y = 0; y < n; y++){
                    for(int dir = 0; dir < 8; dir++){
                        for(int len = 1; len <= grid.length; len++){
                            int val = computeValue(x,y,dir,len);
                            if(val != -1 && isPrime(val))
                                System.out.println(val);
                        }
                    }
                }
            }            
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            System.exit(1);
        }
    }  
     
    static int computeValue(int x, int y, int dir, int len) {
        int value = 0;
        for(int i = 0; i <= len; i++){
            int digit = getDigit(x,y,dir,len);
            if(digit == -1)
                return -1;
            value = value*10 + digit;
        }        
        return value;
    }

    private static int getDigit(int x, int y, int dir, int len) {
        return 0;
    }

    static boolean isPrime(int val) {
        boolean isPrime = true;
        for(int n = 2; n <= val; n++){   
            isPrime = true;
            for(int i = 2; i*i <= val; i++){
                if(n % i == 0)
                    isPrime = false;
            }
        }
        return isPrime;
    }
    
}
