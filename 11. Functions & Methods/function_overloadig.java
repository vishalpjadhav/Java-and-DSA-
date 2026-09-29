public class function_overloadig {
    public static int sum(int a , int b ){
        return a+b;
    }

    public static int sum(int a , int b ,int c){
        return a+b+c;
    }


    public static void main(String [] args){
        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println("Sum of two numbers :- "+sum(a,b));
        System.out.println("Sum of three numbers :- "+sum(a,b,c));
    }
}
