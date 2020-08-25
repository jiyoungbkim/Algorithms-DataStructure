package AlgorithmsforPrograming.sort;

public class Sort05quick {
    public static void main(String[] args) {
        int[] data = {31, 8, 48, 73, 11, 3, 20, 29, 65, 15};
        int len = data.length;
        quickSort(data, 0, len-1);
        for(int x = 0; x < len; x++){
            System.out.println(data[x]);
        }
    }
    public static void quickSort(int[] data, int left, int right) {
        if (left < right) {
            int pivot = partition(data, left, right);
            quickSort(data, left, pivot-1);
            quickSort(data, pivot+1, right);
        }
    }
    public static int partition(int[] data, int left, int right) {
        int pivot = right;
        int i = left-1;
        int j = left;
        while(j < right) {
            if(data[j] < data[pivot]){                               
                swap(data,j,i+1);
                i++;
            } 
            j++;
        }
        swap(data,pivot,i+1);
        return i+1;
    }
    public static void swap(int[] data, int x, int y) {
        int temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}