import java.util.*;
public class type_casting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat(); 
        int b = (int) a;
        System.out.println(b);


        char ch = 'V';
        int number = ch;
        System.out.print(number);

        long c = 1000000000;
        int d = (int) c;
        System.out.println(d);

        short s = 98;
        char h = (char)s;
        System.out.println(h);

        double db = 100.1045;
        int bd = (int)db;
        System.out.println(bd);

        
        sc.close();
    }
}

