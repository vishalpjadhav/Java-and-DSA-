public class Block_Scope {
    public static void main(String [] args){
        int a = 10;
        if (true){
            int b = 12;
        }
        // System.out.println(b); // Error
        System.out.println(a);
    }
}
