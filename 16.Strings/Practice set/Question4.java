import java.util.*;
public class Question4{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        if(str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray(); 
            char[] str2CharArray = str2.toCharArray(); 

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray,str2CharArray);
            if(result){
                System.out.println("Both string are anagram");
            } else {
                System.out.println("Both string are Not anagram");
            }
        } else {
            System.out.println("Both string are not anagram and not equals");
        }

    }
}