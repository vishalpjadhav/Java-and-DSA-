public class Single_Inheritance {
    public static void main(String[] args) {
        Collage c1 = new Collage();
        c1.department();
        c1.exam();
        c1.admission();
    }
}

class University {
    void department() {
        System.out.println("CSE Department ");
        System.out.println("Electrical Department ");
        System.out.println("Mechanical Department ");
        System.out.println("Civil Department ");
        System.out.println("AIML and DS Department ");
        System.out.println("VLSI Department ");
    }
    void exam(){
        System.out.println("Exam time table is Declared");
    }
}

class Collage extends University {
    void admission() {
        System.out.println("First Year admission are open");
    }

    void fees() {
        System.out.println("pay Fees before due date ");
    }

}