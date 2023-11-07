package class04;

public class Dog {
    String name;
    // 기본 생성자라고 하는 것은 아무 매개변수가 없는
    // 클래스명과 동일하게 작성 / 매개변수 없음 / 반환타입 없음
    // 작성하지 않으면 컴파일러가 자동으로 default 생성자 넣음능
    // 기본생성자는 습관처럼 추가하자!!!
    public Dog() {
        System.out.println("기본생성자");
    }
    // 매개변수를 가지는 생성자
    // 생성자 오버로딩
    public Dog(String n) {
        name = n;
    }
}
