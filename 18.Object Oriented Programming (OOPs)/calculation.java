import calcu.Calculator;

public class calculation {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        
        int result = c1.sum(10, 45);
        System.out.println("Sum: " + result);
    }
}