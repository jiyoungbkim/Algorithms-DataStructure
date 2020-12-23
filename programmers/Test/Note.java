package programmers.Test;

import java.util.Iterator;
import java.util.Vector;



public class Note {
    public static void main(String[] args)  {
        
        Vector<Student> members = new Vector<Student>();
        Student student = new Student("김길동", 10);
        members.add(student);
        members.add(new Student("홍길동", 15));

        Iterator<Student> iter = members.iterator(); // Iterator 선언
        while(iter.hasNext()){//다음값이 있는지 체크
            System.out.println(iter.next()); //값 출력
        }

        // Vector<Integer> list = new Vector<Integer>(Arrays.asList(1,2,3));

        // System.out.println(list.get(0));//0번째 index 출력
                        
        // for(Integer i : list) { //for문을 통한 전체출력
        //     System.out.println(i);
        // }

        // Iterator<Integer> iter = list.iterator(); // Iterator 선언
        // while(iter.hasNext()){//다음값이 있는지 체크
        //     System.out.println(iter.next()); //값 출력
        // }
    }

}
