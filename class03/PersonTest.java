package class03;

public class PersonTest {
    public static void main(String[] args) {
        // Person 클래스 정의 해놓음

        // 인스턴스 생성
        Person p = new Person();
        p.age = 24;
        p.name = "Lee";
        p.hobby = "코딩하기";
        p.info();

        Person p2 = new Person();
        // 묵시적 형변환 가능
        p2.study(10);
        p2.study((byte)10);
        p2.study((short)10);
        p2.study(10L);

        // 불가능
//        p2.study(10.0f);
//        p2.study(10.0);
        p2.info();
    }
}
