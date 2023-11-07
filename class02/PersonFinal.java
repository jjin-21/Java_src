package class02;

public class PersonFinal {
    String name;
    int age;
    String hobby;

    public static void info(String name, int age, String hobby) {
        System.out.println("나의 이름은 " + name);
        System.out.println("나의 나이는 " + age);
        System.out.println("나의 취미는 " + hobby);
    }

    public static void main(String[] args) {
            PersonFinal.info("홍길동", 30, "등산");
        }

}
