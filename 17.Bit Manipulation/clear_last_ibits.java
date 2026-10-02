public class clear_last_ibits {
    public static int clear_last_ibit(int n, int i) {
        int bitmask = ~0 << i;
        // System.out.println(n & bitmask);   
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clear_last_ibit(15, 2)); 
    }
}
 