public class binomial_Coefficient {
    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n;i++){
            f = f * i;
        }
        return f;
    }
    // binomial function 
    public static int binomial(int n , int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int fact_nr = factorial(n-r);

        int binomial_coefficient = factn / (factr * fact_nr);
        return binomial_coefficient;
    }
    
    public static void main (String []args){
        int n = 5;
        int r = 2;
        int bino = binomial(n,r);
        System.out.println(bino);
    }
}
