package AlgorithmsforPrograming.sort;

public class Sort03insertion {
    public static void main(String[] args) {
        int [] selSort = {29, 10, 14, 37, 13};
        int n = selSort.length;
        int tmp;
        for(int i = 1; i < n; i++){
            tmp = selSort[i];
            int j = i;
            while (j>0 && selSort[j-1]>tmp){
                selSort[j]=selSort[j-1];
                j--;
            }
            selSort[j]=tmp;
        }
        for(int x = 0; x < n; x++){
            System.out.println(selSort[x]);
        }
    }
}