public class Question2 {

    public static void extract_digit(int n){
       while(n > 0){
        int digit = n % 10; // get last digit 
        System.out.println(digit);

        n = n/10; // remove last digit 
       }
    }
    public static void main(String [] args){
        extract_digit(1478);
    }
}
