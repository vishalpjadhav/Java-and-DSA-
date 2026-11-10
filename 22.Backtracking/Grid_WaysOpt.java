
public class Grid_WaysOpt {

    public static long gridWays(int n, int m) {

        int N = n + m - 2;
        int r = n - 1;

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (N - r + i) / i;
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;
        int m = 5;

        System.out.println(gridWays(n, m));
    }
}
