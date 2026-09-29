public class Question3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        int c = 89;

        
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("the numbers are :- a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("the maximum number is :- " + max);
    }
}