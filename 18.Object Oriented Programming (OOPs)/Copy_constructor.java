public class Copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.age = 20;
        s1.password = "ABCD";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "vish";
        s1.marks[0] = 40;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student(Student s1) {
        marks = new int [3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int [3];
        System.out.println("Construtor is called ....");
    }

    Student(String name) {
        marks = new int [3];
        this.name = name;
    }
}