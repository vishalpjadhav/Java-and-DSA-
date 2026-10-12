public class Abstraction {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.department);
        s1.Roll_no();
        s1.result();
    }
}

abstract class College {
    String department;

    College() {
        department = "Computer Science and Engineering";
    }

    abstract void Roll_no();

    void result() {
        System.out.println("Result Declared");

    }
}

class Student1 extends College {
    Student1() {
        department = "Electrical";
    }

    void Roll_no() {
        System.out.println("Student1 Roll_no is 1004");
    }

    void marks() {
        System.out.println("Java :- 85");
        System.out.println("Html & CSS :- 90");
        System.out.println("Python :- 80");
    }
}