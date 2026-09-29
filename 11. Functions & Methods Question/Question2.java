public class Question2 {
    public static boolean isEven(int n){
        boolean isEven = true ;
        if (n % 2==0){
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }
    public static void main(String [] args){
        System.out.println(isEven(10));
        System.out.println(isEven(11));
    }


}
