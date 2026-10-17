public class Fibonacci {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int fnm1  = fibonacci(n-1);
        int fnm2  = fibonacci(n-2);
        int fibn = fnm1 + fnm2;

        return fibn;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(25));
    }
}
