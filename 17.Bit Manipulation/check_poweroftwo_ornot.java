public class check_poweroftwo_ornot {
    public static boolean isPowerOftwo(int n){
           return (n > 0) && (n &(n-1)) == 0;
    }
    public static void main(String[] args) {
         System.out.println("0 is power of 2 "+ isPowerOftwo(0)); 
         System.out.println("32 is power of 2 "+ isPowerOftwo(32)); 
         System.out.println("15 is power of 2 "+ isPowerOftwo(15)); 
    }
}
