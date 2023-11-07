package class03;

public class Person {
    String name;
    int age;
    String hobby;

    public void info() {
        System.out.println("나의 이름은 " +name+"입니다.");
        System.out.println("나이는 " +age+"살이고, 취미는 " +hobby+"입니다." );
    }

    public void study(int time) {
        System.out.println(time+"만큼 공부함");
    }

    // 메서드 오버로딩
    // 매개변수의 타입이 다르거나 개수가 달라야 함
    public void study(long time) {
        System.out.println(time+ "만큼 공부함!!!");
    }
}
