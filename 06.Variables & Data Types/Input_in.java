import java.util.*;
public class Input_in {
    public static void main(String args []){
    Scanner sc  = new Scanner(System.in);
    
    String name = sc.nextLine();
    System.out.println(name);

    String c = sc.next();
    System.out.println(c);

    int number = sc.nextInt();
    System.out.println(number);

    byte b = sc.nextByte();
    System.out.println(b);

    float f = sc.nextFloat();
    System.out.println(f);

    double d = sc.nextDouble();
    System.out.println(d);

    boolean bool = sc.nextBoolean();
    System.out.println(bool);

    short sh = sc.nextShort();
    System.out.println(sh);

    long l = sc.nextLong();
    System.out.println(l);

    sc.close();
    }
}
  