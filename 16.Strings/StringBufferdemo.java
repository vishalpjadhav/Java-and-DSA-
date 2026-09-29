import java.util.*;
public class StringBufferdemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("ByteCurious");
        StringBuffer sb = new StringBuffer("hello");
        sb.append("World");
        System.out.println(sb);
        sb.setCharAt(5,'w');
        System.out.println(sb);
        sb.replace(1,5,"Hi");
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(5,"java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.charAt(0);
        System.out.println(sb);
        sb.length();
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);
    }
}
