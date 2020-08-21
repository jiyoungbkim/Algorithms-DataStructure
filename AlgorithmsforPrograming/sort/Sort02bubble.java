package AlgorithmsforPrograming.sort;

public class Sort02bubble {
    public static void main(String[] args) {
        int [] selSort = {29, 10, 14, 37, 13};
        int n = selSort.length;
        int tmp;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(selSort[i]>selSort[j]){
                    tmp = selSort[i];
                    selSort[i] = selSort[j];
                    selSort[j] = tmp;
                }
            }
        }
        for(int x = 0; x < n; x++){
            System.out.println(selSort[x]);
        }
    }
}