import java.util.*;
public class if_statement {
public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your age :- ");
    int age = sc.nextInt();
    if (age >= 18){
        System.out.println("You can Vote ");
    }
    sc.close();
}    
}
