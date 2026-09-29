import java.util.*;
public class continue_statement2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number :- ");
            int n = sc.nextInt();
        System.out.println("If You Want to Quit Then Enter (0) Zero");
        if (n == 0){
            break;
        }
            if (n % 10 == 0){
                continue;
            }
            System.out.println("The number was :- "+ n + " Not divisible by 10");
        } while(true); 
    }
}
