public class logical_AND{
    public static void main (String []args){
        int age = 20;
        boolean hasID = true;

        System.out.println(age >= 18 && hasID);
        System.out.println (! hasID);
        System.out.println(age >= 18 || hasID);

    }
}