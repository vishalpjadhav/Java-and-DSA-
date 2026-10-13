public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.college = "Sycet";
        s1.name = "vishal";
        System.out.println(s1.college);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.name = "Vaibhav";
        System.out.println(s2.name+" "+ s2.college);

    }
}
class Student {
    static String college;
    String name;
    int age;

    void setName(String name){
        this.name = name;
    }
    String getname(){
        return this.name;
    }
}