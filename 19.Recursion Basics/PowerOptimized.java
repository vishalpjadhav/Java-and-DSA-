import java.util.logging.Handler;

public class PowerOptimized {
    public static int optimizedpower(int a , int n){
        if(n==0){
            return 1;
        }

        int halfPower = optimizedpower(a,n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
     public static void main(String[] args) {
        System.out.println(optimizedpower(2,10));
     }
}
