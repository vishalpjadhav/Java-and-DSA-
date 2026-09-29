public class unary_operator {
    public static void main (String []args){
        int a = 10;
        int b = ++a;
        int c = 20;
        int d = c++;
        System.out.println(b);
        System.out.println("A: "+a);
        System.out.println(c);
        System.out.println("d"+d);


        int e = 10;
        int f = --e;
        int g = 10;
        int h = g--;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    } 
}
