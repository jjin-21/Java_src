package class01;

public class PersonTest {
    public static void main(String[] args) {
        int size = 2;
        String[] names = new String[size];
        names[0] = "Yang";
        names[1] = "Hong";

        int[] ages = new int[size];
        ages[0] = 45;
        ages[1] = 25;

        String[] hobbies = new String[size];
        hobbies[0] = "Youtube";
        hobbies[1] = "Golf";

//        for (int i=0; i<size; i++) {
//            System.out.println("나의 이름은 " + names[i]);
//            System.out.println("나의 나이는 " + ages[i]);
//            System.out.println("나의 취미는 " + hobbies[i]);
//        }
        for (int i=0; i<size; i++) {
            info(names[i], ages[i], hobbies[i]);
            System.out.println();
        }
    }
    public static void info(String name, int age, String hobby) {
        System.out.println("나의 이름은 " + name);
        System.out.println("나의 나이는 " + age);
        System.out.println("나의 취미는 " + hobby);
    }
}
