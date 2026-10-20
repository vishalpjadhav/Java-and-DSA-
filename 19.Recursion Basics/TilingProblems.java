public class TilingProblems {
    public static int tiling_Problem(int n) {
        if (n < 0) {
            return 0;
        }
        if (n==0 || n == 1) {
            return 1;
        }

        // vertical
        int fnm1 = tiling_Problem(n - 1);

        // horizontal
        int fnm2 = tiling_Problem(n - 2);

        int totWay = fnm1 + fnm2;
        return totWay;
    }

    public static void main(String[] args) {
        System.out.println(tiling_Problem(5));
    }
}