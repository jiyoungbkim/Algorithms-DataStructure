package JavaDataStructure.chapter2.section1;

import java.util.Scanner;

public class Code06 {

    static Polynomial [] polys = new Polynomial[100];
    static int n = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("$ ");
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
                polys[n].terms = new Term [100]; // 배열 생성
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
                char name = sc.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exits.");
                } else {
                    int x = sc.nextInt();
                    int result = calcPolynomial(polys[index], x);
                    System.out.println(result);
                }
            } else if (command.equals("print")){
                char name = sc.next().charAt(0);
                int index = find(name);
                if(index == -1) {
                    System.out.println("No such polynomial exits.");
                } else {
                    printPolynomial(polys[index]);
                }

            } else if (command.equals("exit")) {
                break;
            }
        }
        sc.close();
    }

    private static int calcPolynomial(Polynomial p, int x) {
        int result = 0;
        for(int i = 0; i < p.nTerms; i++)
            result += calcTerm(p.terms[i], x);
        return result;
    }

    private static int calcTerm(Term term, int x) {
        return term.coef * (int)Math.pow( x, term.expo);
    }

    private static void printPolynomial(Polynomial p) {
        for(int i = 0; i < p.nTerms; i++) {
            printTerm(p.terms[i]);
            System.out.print("+");
        }
        System.out.println();
    }

    private static void printTerm(Term term) {
        System.out.print(term.coef + "x^" + term.expo);
    }

    private static void addTerm(Polynomial p, int c, int e) {
        int index = findTerm( p , e );
        if(index != -1) {
            p.terms[index].coef += c;
        } else {
            int i = p.nTerms-1;
            while(i >= 0 && p.terms[i].expo < e) {
                p.terms[i+1] = p.terms[i];
                i--;
            }
            p.terms[i+1] = new Term();
            p.terms[i+1].coef = c;
            p.terms[i+1].expo = e;
            p.nTerms++;
        }
    }

    private static int findTerm(Polynomial p, int e) {
        for(int i = 0; i < p.nTerms && p.terms[i].expo >= e; i++){
            if(p.terms[i].expo == e)
                return i;
        }
        return -1;
    }

    private static int find(char name) {
        for(int i = 0; i < n; i++)
            if(polys[i].name == name)
                return i;        
        return -1;
    }
}
