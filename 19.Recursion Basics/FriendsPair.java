public class FriendsPair {
    public static int friendsParing(int n){
        if(n == 1 || n == 2){
            return n;
        }

        // int fnm1 = friendsParing(n-1);
        // int fnm2 = friendsParing(n-2);
        // int pairWays = (n-1)*fnm2;

        // int totalWays = pairWays + fnm1;


        // return totalWays;
        return friendsParing(n-1) + (n-1) * friendsParing(n-2);

    }
    public static void main(String[] args) {
         System.out.println(friendsParing(3));
    }
}
