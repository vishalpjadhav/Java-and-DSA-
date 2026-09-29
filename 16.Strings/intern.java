public class intern {
    public static void main(String[] args) {
        String str1 = new String("Hello").intern();
        String str2 = "Hello";
        System.out.println(str1 == str2);


        String s1 = new String("abc");
        String s2 = s1.intern();
        String s3 = new String("abc");

        System.out.println(s2 == s3);

    }
}
