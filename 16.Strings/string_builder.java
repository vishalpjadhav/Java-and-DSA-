public class string_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Vishal");
        System.out.println(str);
        str.append("a");
        System.out.println(str);
        // str.insert(0,'r');
        // System.out.println(str);
        str.setCharAt(0,'s');
        System.out.println(str);

        str.delete(1,3);
        System.out.println(str);
        str.reverse();
        System.out.println(str);

    }
}
