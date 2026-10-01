public class Set_ith_Bit {
    public static int setithbit(int n,int i){
        int bitmask = 1<<i;

        if((n | bitmask)==0){
            return n|bitmask;
        }else {
            return n|bitmask;
        }
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10,2));
    }
}
