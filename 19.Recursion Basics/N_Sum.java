public class N_Sum {
    public static int CalcSum(int n){

        if(n==1){
            return 1;
        }
        int Snm1 = CalcSum(n-1);
        int fSum = n + Snm1;
        return fSum;

    }
    public static void main(String[] args) {
        System.out.println(CalcSum(5));
    }
}
