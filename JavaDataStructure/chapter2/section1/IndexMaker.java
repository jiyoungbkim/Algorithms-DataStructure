package JavaDataStructure.chapter2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IndexMaker {

    static Item [] items = new Item[100000];
    //static String[] words = new String[100000];
    //static int[] count = new int[100000];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String command = sc.next();
            if (command.equals("read")) {
                String fileName = sc.next();
                makeIndex(fileName);

            } else if (command.equals("find")) {
                String word = sc.next();
                int index = findWord(word);
                if (index > -1)
                    System.out.println("The word : " + items[index].word + " appears " + items[index].count + " times.");
                else
                    System.out.println("The word : " + word + " does not appear.");
            } else if (command.equals("saveas")) {
                String fileName = sc.next();
                savsAs(fileName);
            } else if (command.equals("exit"))
                break;
        }
        sc.close();
        //for (int i = 0; i < n; i++)
            //System.out.println(words[i] + " " + count[i]);
    }

    static void savsAs(String fileName) {

        try {
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for(int i = 0; i < n; i++){
                outFile.println(items[i].word+" "+items[i].count);
            }
            outFile.close();
        } catch (IOException e) {
            System.out.println("Save failed");
            return;
        }        
    }

    static void makeIndex(String fileName) {
        try {
            Scanner inFile = new Scanner(new File(fileName));
            while(inFile.hasNext()){
                String word = inFile.next();
                String trimmed = trimming(word);
                if(trimmed != null){
                    String t = trimmed.toLowerCase();
                    addWord(t);
                }                    
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file");
            return;
        }
    }

    static String trimming(String word) {
        int i = 0 , j = word.length()-1; 
        while( i < word.length() && !Character.isLetter(word.charAt(i))) // while i-th char is not letter
            i++;
        while( j >= 0 && !Character.isLetter(word.charAt(j)))
            j--;         
        if ( i > j )
            return null;
        return word.substring(i, j+1);
    }

    static void addWord(String word) {
        int index = findWord(word);
        if(index != -1){
            items[index].count++;
        } else {
            int i = n-1;
            for(; i>=0 && items[i].word.compareToIgnoreCase(word) > 0; i--){
                items[i+1] = items[i];
            }
            items[i+1] = new Item();
            items[i+1].word = word;
            items[i+1].count = 1;
            n++;
        }
    }

    static int findWord(String word) {
        for(int i = 0; i < n; i++){
            //if(words[i].equals(word))
            if(items[i].word.equalsIgnoreCase(word))
                return i;
        }
        return -1;
    }
}
