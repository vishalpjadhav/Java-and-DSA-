import java.util.*;
public class Compare {
    public static void main(String[] args) {
        
        String name =   "vishal";
        String n = "vishal";
        String m = new String ("vishal");

        if(name.equals(n)){
            System.out.println("name and n equal");
        } 
        if(name.equals(m)){
            System.out.println("name and m equal");
        }

        if(name == n){
            System.out.println("name and n equal");
        }
    }
}
