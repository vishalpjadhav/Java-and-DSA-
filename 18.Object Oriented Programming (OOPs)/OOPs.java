public class OOPs {
    public static void main(String[] args) {
        Student s1 = new Student("Vishal", 1004);
    }
}

class Student {
    String name;
    int roll_no;

    Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

}
