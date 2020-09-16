package JavaDataStructure.chapter2.section1;

public class Code01_2 {
    public static void main(String[] args) {
        Person1 first = new Person1(); // 클래스 타입의 객체 생성
        first.name = "John";
        first.number = "0102483120";

        System.out.println("Name: "+first.name+", Number: "+first.number);

        Person1 second = first;
        second.name = "Tom";
        
        System.out.println("Name: "+first.name+", Number: "+first.number);

        Person1 [] members = new Person1[100];
        members[0] = first;
        members[1] = second;

        System.out.println("Name: "+members[0].name+", Number: "+members[0].number);
        System.out.println("Name: "+members[1].name+", Number: "+members[1].number);
        
        members[2] = new Person1(); // 새로운 객체를 만들어 주지 않으면
        members[2].name = "David"; // 값을 넣어줄 수가 없고 오류 발생
        members[2].number = "2376457264";
        
        System.out.println("Name: "+members[2].name+", Number: "+members[2].number);
    }
}
