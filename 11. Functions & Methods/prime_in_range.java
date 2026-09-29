public class prime_in_range {
        public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for( int i =2 ; i <=Math.sqrt(n); i ++){
            if( n % i == 0){
                return false;
            }
        }
        return true;

    }

    public static void primeinrange(int n){
        for (int i =2; i <=n ; i ++){
            if(isPrime(i)){
                System.out.println(i+" Is a Prime ");
            }
        }
        System.out.println();
    }
    public static void main(String [] args){
        primeinrange(20);
    }

}
