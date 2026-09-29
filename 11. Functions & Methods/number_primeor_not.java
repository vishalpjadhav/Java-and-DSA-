public class number_primeor_not {
    public static boolean isPrime(int n ){
        boolean isPrime = true;
        if (n == 1){
            isPrime = false;
        }else{
    
        }
        for (int i =2 ; i <=n-1 ; i ++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main (String [] args){
        System.out.println(isPrime(17));
    }
}



