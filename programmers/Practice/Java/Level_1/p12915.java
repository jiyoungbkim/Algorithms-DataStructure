package programmers.Practice.Java.Level_1;

import java.util.*;
// 문자열 내 마음대로 정렬하기
// custom sort
public class p12915 {
    public static void main(String[] args) {
        p12915 p12915 = new p12915();
        String[] result = p12915.solution3(new String[]{"abcd", "abce", "cdx"}, 1);
        for(String s : result){
            System.out.println(s);
        }
    }
    // HashMap에 해당 인덱스의 문자를 키로 넣고 키정렬을 하려고 했으나, 키 중복 불가될 경우가 있어 잘못된 방법
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        HashMap<Character, String> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            map.put(strings[i].charAt(n), strings[i]);
        }
        System.out.println(map);
        List<Map.Entry<Character, String>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        LinkedHashMap<Character, String> result = new LinkedHashMap<>();
        for (Map.Entry<Character, String> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        int c = 0;
        for (Map.Entry<Character, String> entry : result.entrySet()) {
            //System.out.println("Key: " + entry.getKey() + ", "
                    //+ "Value: " + entry.getValue());
            answer[c++] = entry.getValue();
        }
        return answer;
    }
    public String[] solution2(String[] strings, int n) {       
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
    // h
    public String[] solution3(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2) {
                // 인덱스 n의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
                if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                // o1이 사전식 순서가 느리면 양수, 빠르면 음수를 리턴
                else return s1.charAt(n) - s2.charAt(n);
            }            
        });
        return strings;
    }
}