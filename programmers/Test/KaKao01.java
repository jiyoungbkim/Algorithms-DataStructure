package programmers.Test;

public class KaKao01 {

    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefg.hijklm";
        
        String result = solution(new_id);
        System.out.println("네오의 프로그램이 추천하는 새로운 아이디는 "+result+"입니다.");
    }

    public static String solution(String new_id) {
        String answer = "";
        String[] except = { "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "=", "+", "[", "{", "]", "}",
                ":", "?", ",", "<", ">", "}", ";" };

        answer = new_id.toLowerCase(); 
        System.out.println("step1: "+answer); 

        for (String ex : except) {
            if (answer.contains(ex)) {
                answer = answer.replace(ex, "");
            }
        }
        System.out.println("step2: "+answer); 

        int dot = 0;
        for (int i = 0; i < answer.length(); i++) {

            String dt = Character.toString(answer.charAt(i));
            if (dt.equals("."))
                dot++;
                //System.out.println("dot: "+ dot);
            if (dot > 1) {
                //int start = answer.indexOf(".");
                //System.out.println("start :"+start);
                //answer = answer.substring(start+dot-1, answer.length());
                String dotS = "";
                while(0 < dot){
                    dotS += ".";
                    dot--;
                }  
                //System.out.println(dotS);              
                answer = answer.replace(dotS, ".");
                dot = 0;
            }
        }
        System.out.println("step3: "+answer);

        if(answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        System.out.println("step6: "+answer);

        int dotStart = answer.indexOf(".");        
        if(dotStart == 0) {
            if(answer.length() > 1)
                answer = answer.substring(dotStart+1, answer.length());
            else
                answer = "";
        }        
        int dotEnd = answer.lastIndexOf(".");
        if(dotEnd == answer.length()-1 && answer.length() > 1) 
            answer = answer.substring(0, dotEnd);
        System.out.println("step4: "+answer);

        if(answer.equals("")) answer = "a";
        System.out.println("step5: "+answer);

        if(answer.length() <= 2) {
            String lenEnd = Character.toString(answer.charAt(answer.length()-1));
            //System.out.println(lenEnd);
            while(answer.length() != 3)
                answer += lenEnd;
        }
        System.out.println("step7: "+answer);

        return answer;
    }    
}
