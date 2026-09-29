public class charAt {
    public static void print(String name) {
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        String name = "Vishal";
        print(name);
    }
}
