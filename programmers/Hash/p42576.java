package programmers.Hash;

import java.util.HashMap;

public class p42576 {
    public static void main(String[] args) {
        String[] participant = {"marina","josipa","nikola","vinko","filipa"};
        String[] completion = {"josipa","filipa","marina","nikola"};
        String result = solution(participant, completion);
        System.out.println(result);
    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for(String person : completion){
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        for(String person : participant){
            map.put(person, map.getOrDefault(person, 0) - 1);
            if(map.get(person) < 0)
                return person;
        }
        return answer;
    }
}