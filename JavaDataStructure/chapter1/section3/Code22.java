package JavaDataStructure.chapter1.section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code22 {

    static String[] words = new String[100000];
    static int[] count = new int[100000];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("$");
            String command = sc.next();
            if (command.equals("read")) {
                String fileName = sc.next();
                makeIndex(fileName);

            } else if (command.equals("find")) {

            } else if (command.equals("saveas")) {

            } else if (command.equals("exit"))
                break;
        }
        sc.close();
    }

    static void makeIndex(String fileName) {
        try {
            Scanner inFile = new Scanner(new File(fileName));
            while(inFile.hasNext()){
                String str = inFile.next();
                addWord(str);
            }

            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }
    }

    static void addWord(String str) {
        findWord(str);
    }
}
