import java.util.Arrays;

public class StudentDB {

    private String id;
    private String name;
    private char gender;
    private String email;
    private String pw;
    private String contactNo;
    private int age;
    private int year;
    private double[] gpa = {};
    private boolean online = false;

    public StudentDB(String id, String name, char gender, int age, int year,
            String email, String pw, String contactNo) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.year = year;
        this.email = email;
        this.pw = pw;
        this.contactNo = contactNo;
    }

    void login(String email, String pw) {
        if (this.email == email && this.pw == pw) {
            this.online = true;
            System.out.println("Login successful.");
        } else {
            System.out.println("Incorrect email or password.");
        }
    }

    void setPw(String pw) {
        this.pw = pw;
    }

    void setGPA(double gpa) {
        double arrNew[] = Arrays.copyOf(this.gpa, this.gpa.length + 1);
        arrNew[this.gpa.length] = gpa;
        this.gpa = arrNew;

    }

    public Object[] getInfo() {
        if (online == true) {
            Object[] returnInfo = { name, id, gender, email, contactNo, age, year, Arrays.toString(gpa) };
            return returnInfo;
        } else {
            System.out.println("Access denied.");
            return null;
        }
    }
}
