import java.util.*;
public class prime_or_not {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if(n == 1){
            System.out.println(n+" is not Prime Number ");
        }else if (n ==2){
            System.out.println(n+" is Prime number");

        }
         else {
            for(int i = 2; i <= Math.sqrt(n) ; i ++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == true){
            System.out.println(n+" is Prime");
        } else {
            System.out.println(n+" is Not Prime");
        }

        }
        sc.close();

        
    }
}
