package JavaDataStructure.chapter2.section1;

import java.util.Scanner;

public class Code06 {

    static Polynomial [] polys = new Polynomial[100];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String command = sc.next();
            if(command.equals("create")){
                char name = sc.next().charAt(0);

                // Polynomial p = new Polynomial();
                // p.name = name;
                // p.nTerms = 0;
                // polys[n] = p;
                // n++;

                polys[n] = new Polynomial();
                polys[n].name = name;
                polys[n].nTerms = 0;
                n++;

            } else if (command.equals("add")){
                char name = sc.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exits.");
                } else {
                    int c = sc.nextInt();
                    int e = sc.nextInt();
                    addTerm(polys[index], c, e);
                }
            } else if (command.equals("calc")){

            } else if (command.equals("print")){

            } else if (command.equals("exit")) {
                break;
            }
        }
        sc.close();
    }

    private static void addTerm(Polynomial p, int c, int e) {
        
    }

    private static int find(char name) {
        for(int i = 0; i < n; i++){
            if(polys[n].name == name)
                return i;
        }
        return 0;
    }
}
