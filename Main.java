import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StudentDB james = new StudentDB("12345678", "James", 'M', 22, 4,
                "james@gmail.com", "abc123", "1234");

        james.login("james@gmail.com", "abc123");
        System.out.println(Arrays.toString(james.getInfo()));
        james.setGPA(3);
        System.out.println(Arrays.toString(james.getInfo()));
        james.setGPA(3.2);
        System.out.println(Arrays.toString(james.getInfo()));
    }
}
