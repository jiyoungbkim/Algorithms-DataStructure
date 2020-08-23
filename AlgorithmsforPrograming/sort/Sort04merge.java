package AlgorithmsforPrograming.sort;

public class Sort04merge {
    public static void main(String[] args) {
        int [] data = {2, 5, 18, 23, 3, 7, 11, 19};
        int r = data.length;
        mergeSort(data, 0, r-1);
        for(int x = 0; x < r; x++){
            System.out.println(data[x]);
        }
    }
    public static void mergeSort(int data[], int left, int right) {
        if(left < right){
            int mid = (left+right)/2; // 배열의 중간 위치
            mergeSort(data, left, mid); // 처음부터 중간까지 분할
            mergeSort(data, mid+1, right); // 중간다음부터 끝까지 분할
            merge(data, left, mid, right); // 합병
        }        
    }
    public static void merge(int data[], int left, int mid, int right) {
        int i = left, j = mid+1, k = left;
        int [] tmp= new int[data.length];
        // left~mid 배열과 mid+1~right 배열의 각 인덱스 비교
        while(i <= mid && j <= right){
            if(data[i] <= data[j]) {
                tmp[k++]=data[i++]; // 값을 대입하고 인덱스 하나씩 증가
            }               
            else {
                tmp[k++]=data[j++];
            }
        }
        // left배열에 값이 남은 경우
        while(i <= mid) {
            tmp[k++]=data[i++];
        }
        // right배열에 값이 남은 경우
        while(j <= right) {
            tmp[k++]=data[j++];
        }
        // 임시배열을 원본배열로 옯겨준다.
        for(i=left; i <= right; i++) {
            data[i]=tmp[i];
        }
    }

}