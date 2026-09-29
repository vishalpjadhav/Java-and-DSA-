public class concatenation {
    public static void main(String[] args) {
        String fname = "Vishal";
        String lname = "Jadhav";
        String Full_name = fname + " " + lname;
        System.out.println(Full_name);
        String result = fname.concat(lname);
        System.out.println("Using the concat() method :- "+ result);
        System.out.println(Full_name.length());
    }
}
