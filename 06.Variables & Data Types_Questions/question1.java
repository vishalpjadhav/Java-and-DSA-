/*Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
these 3 numbers. */
import java.util.*;
public class question1 {
    public static void main (String args []){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int avg = (a+b+c)/3;
    System.out.println(avg);
    sc.close();
    }
    
}
