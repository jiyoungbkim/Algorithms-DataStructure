package AlgorithmsforPrograming.recursion;

public class Recursion13sequentialSearch {
    public static void main(String[] args) {
        int [] data = {3, 14, 7, 29, 35};
        int n = data.length;
        int target = 7;

        int result = searchMid(data, 0, n-1, target);
        System.out.println(result);
    }
    public static int search(int [] data, int begin, int end, int target){
        if(begin > end) return -1; //데이터가 0개
        else if (target == data[begin]) return begin;
        else return search(data, begin+1, end, target);
        //else return search(data, begin, end-1, target);         
    }
    public static int searchMid(int [] data, int begin, int end, int target){
        if(begin > end) {
            return -1;
        } else {
            int mid = (begin + end) /2;
            if(target == data[mid]) return mid;
            int index = searchMid(data, begin, mid-1, target);
            if(index != -1) return index; // 앞쪽에 찾는 수가 있는 경우
            else {
                return searchMid(data, mid+1, end, target);
            }
        }
    }
}