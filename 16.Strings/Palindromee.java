public class Palindromee {
    public static boolean palindrome(String str){
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left ++; 
            right --;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madham";
        boolean ispalindrom = palindrome(str);

        if(ispalindrom){
            System.out.println("String is palindrome :- "+ispalindrom);
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
