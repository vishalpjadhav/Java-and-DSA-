public class clear_rangeogbits {
    public static int clear_range_ibit(int n, int i,int j){
        int a = ((~0) << (j+1));
        int b = ((1<<i)-1);
        int bitmask = a | b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_range_ibit(15,2,4));
    }
}
