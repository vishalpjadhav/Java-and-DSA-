public class Type_Promotion_in_expressions2 {
    public static void main(String args []){
        byte b = 5;
        byte a = (byte)(b * 2);
        System.out.println(a);
    }
}
