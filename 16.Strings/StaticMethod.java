public class StaticMethod {
    public static void main(String[] args) {
        int addition = Calculator.add(10,45);
        System.out.println(addition);
    }
}

class Calculator {
    static int add(int a,int b ){
        return a+b;
    }
}
