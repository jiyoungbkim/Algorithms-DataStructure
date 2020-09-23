package JavaDataStructure.chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {

    static MyRectangle1[] rects = new MyRectangle1[100]; // 사각형들의 배열
    static int n = 0; // 사각형의 개수

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("JavaDataStructure/chapter2/section1/data.txt"));
            while(inFile.hasNext()){
                rects[n] = new MyRectangle1();
                rects[n].lu = new MyPoint1();
                rects[n].lu.x = inFile.nextInt();
                rects[n].lu.y = inFile.nextInt();
                rects[n].width = inFile.nextInt();
                rects[n].height = inFile.nextInt();
                n++;
            }            
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No data file.");
            System.exit(1);
        }
        bubbleSort();
        for(int i = 0; i < n; i++){
            System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
        }
    }

    private static void bubbleSort() {
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(calcArea(rects[j]) > calcArea(rects[j+1])){
                    MyRectangle1 tmp = rects[j];
                    rects[j] = rects[j+1];
                    rects[j+1] = tmp;
                }
            }
        }
    }
    public static int calcArea (MyRectangle1 r)
    {
        return r.width * r.height;
    }
}
