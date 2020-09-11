package AlgorithmsforPrograming.recursion;

public class Recursion16nQueens {
    private static int N = 4;
    private static int[] cols = new int[N+1];

    public static void main(String[] args) {        
        queens(0);
        for(int i = 1; i <= N; i++){
            System.out.print(cols[i]+" ");
        }
    }
    
    static boolean queens(int level) {
        if(!promsing(level))
            return false;
        else if(level==N)          
            return true;                   
        for(int i=1; i <= N; i++){
            cols[level+1] = i;
            if(queens(level+1))
                return true;
        } 
        return false;                          
    }

    static boolean promsing(int level) {
        for(int i = 1; i<level; i++){
            if(cols[i]==cols[level])
                return false;
            else if (level-i==Math.abs(cols[level]-cols[i]))
                return false;
        }
        return true;
    }

}
