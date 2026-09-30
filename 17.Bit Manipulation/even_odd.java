public class even_odd {
    public static void evenorOdd(int n){
        int bitmask = 1;
        if ((n & bitmask)==0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number ");
        }
    }
    public static void main(String[] args) {
        int n = 11;
        evenorOdd(n);
        evenorOdd(13);
        evenorOdd(40);
    }
}
