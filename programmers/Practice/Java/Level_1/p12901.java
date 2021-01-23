package programmers.Practice.Java.Level_1;

import java.time.LocalDate;
// 2016년
// getDayName
public class p12901 {
    public String solution(int a, int b) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int month = 0;
        for(int i = 0; i < a-1; i++){
            month += months[i];
        }
        month += b;
        return days[month%7];
    }
    // LocalDate 사용
    public String solution2(int a, int b) {
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
    }
}