public class Question1 {
    public static void swap_two_numbers(int a , int b){
        // original a and b values 
        System.out.print("Original a and b values");
        System.out.println(" a :- "+ a +" b :-  "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap ");
        System.out.println("a :- "+a);
        System.out.println("b :- "+b);
    }
    public static void main(String [] args){
        int a = 10;
        int b = 3;
        swap_two_numbers(a,b);
       
       
    }
}
