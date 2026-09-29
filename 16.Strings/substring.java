public class substring {
    public static String substrings(String name, int stindex, int enindex) {
        String substr = "";
        for (int i = stindex; i < enindex; i++) {
            substr += name.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String name = "Vishaaal";
        // using loop and iteration approach 
        System.out.println(substrings(name, 2, 6));

        // using built-in function   substring(strindex,endindex);
        System.out.println(name.substring(0,5));

    }
}
