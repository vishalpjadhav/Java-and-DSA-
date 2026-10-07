public class Types_constructor {
    public static void main(String[] args) {
        Student s1 = new Student("vishal");
        Student s2 = new Student(1004);
        System.out.println(s1.roll_no);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
    }
}
class Student {
    String name ;
    int roll_no;



    Student(){
        System.out.println("NO-Arguments constructor ...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll_no){
        this.roll_no = roll_no;
    }
}