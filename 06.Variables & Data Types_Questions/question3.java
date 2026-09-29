/*Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill. */
import java.util.*;
public class question3 {
    public static void main (String [] args ){
    Scanner sc = new Scanner(System.in);
    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();

    float total = pen + pencil + eraser;
    System.out.println("Total price:"+total);


    float final_price = total +(0.18f*total);
    System.out.println(final_price);
    
    sc.close();
    }
}
