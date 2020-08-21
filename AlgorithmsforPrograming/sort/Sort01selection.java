package AlgorithmsforPrograming.sort;

public class Sort01selection {
    public static void main(String[] args) {
        int [] selSort = {29, 10, 14, 37, 13};
        int n = selSort.length;
        int tmp;
        int maxIndex;
        for(int i= n-1; i > 0; i--){
            maxIndex = i;
            for(int j=0; j < i; j++){
                if(selSort[maxIndex] < selSort[j]){
                    maxIndex = j;
                }                                  
            }
            tmp = selSort[i];
            selSort[i]=selSort[maxIndex];
            selSort[maxIndex]=tmp;
        }
        for(int i = 0; i < n; i++){
            System.out.println(selSort[i]);
        }                       
    }
}