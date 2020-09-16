package JavaDataStructure.chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code02 {
    static Person1[] members = new Person1[100];
    static int n = 0;

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("JavaDataStructure/chapter1/section2/input.txt"));
            while(inFile.hasNext()) {
                String name = inFile.next();
                String number = inFile.next();
                members[n] = new Person1();
                members[n].name = name;
                members[n].number = number;
                n++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }
        for(int i = 0; i < n; i++){
            System.out.println(members[i].name + " " + members[i].number);
        }
    }
}
