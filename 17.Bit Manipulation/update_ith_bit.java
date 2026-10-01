public class update_ith_bit {
    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }
    public static int updateithbit(int n,int i, int newbit){
         n = clearithbit(n,i);
        int bitmask = newbit<<i;
        return n | bitmask ;
    }
    public static void main(String[] args) {
        System.out.println(updateithbit(10,2,1));

    }
}
