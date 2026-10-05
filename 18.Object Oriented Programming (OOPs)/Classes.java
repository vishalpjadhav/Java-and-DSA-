public class Classes {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        System.out.println("\n");

        Student s1 = new Student();
        s1.name = "Vishal";
        s1.age = 21;
        s1.calcPercentage(80,70,90);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.percentage);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
