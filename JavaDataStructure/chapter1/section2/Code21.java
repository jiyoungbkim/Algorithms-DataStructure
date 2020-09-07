package JavaDataStructure.chapter1.section2;

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
                    int val = grid[x][y];
                    if(isPrime(val))
                        System.out.println(val);
                    for(int dir = 0; dir < 8; dir++){                        
                        for(int len = 2; len <= n; len++){
                            val = computeValue(x,y,dir,len);
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
        for(int i = 0; i < len; i++){
            int digit = getDigit(x,y,dir,i);
            if(digit == -1){
                 return -1;
            }               
            value = value*10 + digit;
        }        
        return value;
    }
    static int [] offsetX = {-1,-1,0,1,1,1,0,-1};
    static int [] offsetY = {0,1,1,1,0,-1,-1,-1};
    
    static int getDigit(int x, int y, int dir, int len) {
        
        int newX = x + len*offsetX[dir];
        int newY = y + len*offsetY[dir];
        if(newX < 0 || newX >= grid.length || newY < 0 || newY >= grid.length){
            return -1;
        }            
        else {       
            //System.out.println(grid[newX][newY]);     
            return grid[newX][newY];            
        }            
    }

    static boolean isPrime(int val) {   
        if(val == 0 || val == 1) return false;  
        for(int i = 2; i*i <= val; i++){
            if(val % i == 0){
                return false;
            }                    
        }        
        return true;
    }    
}
